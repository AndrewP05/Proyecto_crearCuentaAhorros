package Datos;

import java.util.Date;
import Datos.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cuenta 
{
    private float saldo = 0;
    private Cliente elCliente;
    
    public float obSaldo()
    {
        return this.saldo;
    }
    public Cliente obElCliente()
    {
        return this.elCliente;
    }
    
    public void modiSaldo(float saldo)
    {
        this.saldo = saldo;
    }
    public void modiElCliente(Cliente elCliente)
    {
        this.elCliente = elCliente;
    }

    public String generarNumeroCuenta()
    {
        Cliente x = new Cliente();
        x.extraerDigitosIdentificacion();
        String numeroCuenta = "11"+"22"+"4 ultimos digitos";
        return numeroCuenta;
    }
    
    
}
