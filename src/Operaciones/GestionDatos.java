package Operaciones;

import java.util.HashMap;
import java.util.Map;
import Datos.Cliente;
import Datos.Cuenta;
import java.io.Serializable;
import utilidades.Persistencia;

public class GestionDatos implements Serializable
{
    private Map<String, Cuenta> listCuentas;
    
    public GestionDatos()
    {
        if(listCuentas == null)
        {
            listCuentas = (Map<String, Cuenta> )Persistencia.recuperar();
            if(listCuentas == null)
            {
                listCuentas = new HashMap<>();
            }
                
        }
    }
    
    private Cliente crearCliente(String nombre, String identificacion, float saldoInicial)
    {
        
        Cliente s = new Cliente();
        s.modiNombre(nombre);
        s.modiIdentificacion(identificacion);
        s.modiSaldoInicial(saldoInicial);
       
        
        
        return s;
    }
    
    public Cuenta crearCuenta(String nombre, String identificacion, float saldoInicial)
    {
        if(nombre == null || identificacion == null || saldoInicial == -1 || nombre.isEmpty() || identificacion.isEmpty())
        {
            return null;
        }
        else
        {
            
            Cliente elCliente = this.crearCliente(nombre, identificacion, saldoInicial);
            Cuenta c = new Cuenta();
            c.modiElCliente(elCliente);
            c.modiSaldo(saldoInicial);
            String numCuenta = this.generarNumCuenta(identificacion);
            if(numCuenta != null)
            {
                c.setNumCuenta(numCuenta);
                listCuentas.put(c.getNumCuenta(),c);
                Persistencia.guardar(listCuentas);
             
                return c;
            }
            else
            {
                return null;
            }
            
        }
    }
    
    
    public Cuenta modificarSaldo(float saldo)
    {
        if(saldo == -1)
        {
            return null;
        }
        else 
        {
            Cuenta elSaldo = this.modificarSaldo(saldo);
            Cuenta t = new Cuenta();
            t.modiSaldo(saldo);
            
            return t;
        }
    }
    
    
    public String generarNumCuenta(String identificacion) 
    {
        if(identificacion.length()>4)
        {
            char num1 = identificacion.charAt(identificacion.length()-1);
            char num2 = identificacion.charAt(identificacion.length()-2);
            char num3 = identificacion.charAt(identificacion.length()-3);
            char num4 = identificacion.charAt(identificacion.length()-4); 
            
            String Digitos = (Character.toString(num1)+Character.toString(num2)+Character.toString(num3)+Character.toString(num4));
            
            String numeroCuenta ="11"+"22"+Digitos;
            
            return numeroCuenta;
        }
        else
        {
            return null;
        }
  
    }
    
    public Cuenta generarCuenta(String nombre, String identificacion, float saldoInicial, float saldo ,String numCuenta)
    {
        if(nombre == null || identificacion == null || saldoInicial == -1 || saldo == -1|| numCuenta == null || nombre.isEmpty() || identificacion.isEmpty() || numCuenta.isEmpty())
        {
           return null;
        }
        else
        {
           Cliente elCliente = this.crearCliente(nombre, identificacion, saldoInicial);
           Cuenta rc = new Cuenta();
           
           Persistencia.guardar(listCuentas);
           return rc;
        }
    }
    
    public Map<String, Cuenta> obtenerLista()
    {
        return (Map<String, Cuenta>) this.listCuentas;
    }
    
}
