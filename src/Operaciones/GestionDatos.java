package Operaciones;

import Datos.*;

public class GestionDatos 
{
    private Cliente crearCliente(String nombre, String identificacion, float saldoinicial)
    {
        Cliente elCliente = this.crearCliente(nombre, identificacion, saldoinicial);
        Cliente s = new Cliente();
        s.modiNombre(nombre);
        s.modiIdentificacion(identificacion);
        s.modiSaldoInicial(saldoinicial);
        
        return s;
    }
    
    public Cuenta crearCuenta(String nombre, String identificacion, float saldoInicial, float saldo, String numeroCuenta)
    {
        if(nombre == null || identificacion == null || saldoInicial == -1 || saldo == -1 || numeroCuenta == null || nombre.isEmpty() || identificacion.isEmpty() || numeroCuenta.isEmpty())
        {
            return null;
        }
        else
        {
            Cliente elCliente = this.crearCliente(nombre, identificacion, saldoInicial);
            Cuenta c = new Cuenta();
            c.modiElCliente(elCliente);
            c.modiSaldo(saldo);
            c.generarNumeroCuenta();
            
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
