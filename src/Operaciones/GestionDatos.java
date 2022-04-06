package Operaciones;

import Datos.Cliente;
import Datos.Cuenta;

public class GestionDatos 
{
    public Cliente crearCliente(String nombre, String identificacion, float saldoInicial)
    {
        if(nombre == null || identificacion == null || saldoInicial == -1 || nombre.isEmpty() || identificacion.isEmpty())
        {
            return null;
        }
        else
        {
            Cliente elCliente = this.crearCliente(nombre, identificacion, saldoInicial);
            Cliente s = new Cliente();
            s.modiNombre(nombre);
            s.modiIdentificacion(identificacion);
            s.modiSaldoInicial(saldoInicial);
            
            return s;
        }
    }
}
