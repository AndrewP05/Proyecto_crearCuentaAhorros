package Datos;

import java.util.Date;
import Datos.*;

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
        
        String numeroCuenta = "11"+"22"+"4 ultimos digitos";
        return numeroCuenta;
    }
    
    public Date obtenerFechaCreacion()
    {
        
        return null;
    }
    
}
