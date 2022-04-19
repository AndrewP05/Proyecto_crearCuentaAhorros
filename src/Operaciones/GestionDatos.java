package Operaciones;

import Datos.*;

public class GestionDatos 
{
    private Cliente crearCliente(String nombre, String identificacion, float saldoInicial)
    {
        Cliente elCliente = this.crearCliente(nombre, identificacion, saldoInicial);
        Cliente s = new Cliente();
        s.modiNombre(nombre);
        s.modiIdentificacion(identificacion);
        s.modiSaldoInicial(saldoInicial);
       
        
        
        return s;
    }
    
    public Cuenta crearCuenta(String nombre, String identificacion, float saldoInicial, float saldo, String numCuenta)
    {
        if(nombre == null || identificacion == null || saldoInicial == -1 || saldo == -1 || numCuenta == null || nombre.isEmpty() || identificacion.isEmpty() || numCuenta.isEmpty())
        {
            return null;
        }
        else
        {
            Cliente elCliente = this.crearCliente(nombre, identificacion, saldoInicial);
            Cuenta c = new Cuenta();
            c.modiElCliente(elCliente);
            c.modiSaldo(saldo);

          
        
            return c;
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
    
    
}
