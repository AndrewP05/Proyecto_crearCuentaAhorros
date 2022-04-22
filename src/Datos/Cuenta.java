package Datos;

import java.util.Date;
import Datos.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cuenta 
{
    private float saldo;
    private Cliente elCliente;
    private String numCuenta;
    
    
    public float obSaldo()
    {
        return this.saldo;
    }
    public Cliente obElCliente()
    {
        return this.elCliente;
    }

    public String getNumCuenta() 
    {
        return numCuenta;
    }
    
    public void modiSaldo(float saldo)
    {
        this.saldo = saldo;
    }
    public void modiElCliente(Cliente elCliente)
    {
        this.elCliente = elCliente;
    }
     public void setNumCuenta(String numCuenta) 
    {
        this.numCuenta = numCuenta;
    }
     @Override
    public String toString() {
        return " Numero de cuenta"+this.numCuenta+" cliente  "+this.elCliente+"  saldo "+this.saldo;
       
    }

    
}
