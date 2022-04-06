package Datos;

import java.util.Date;
import Datos.*;

public class Cuenta 
{
    private float saldo;
    private Cliente elCliente;
    
    public float obSaldo()
    {
        return this.saldo;
    }
    
    public void modiSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    public String generarNumeroCuenta()
    {
        
        return null;
    }
    
    public Date obtenerFechaCreacion()
    {
        return null;
    }
}
