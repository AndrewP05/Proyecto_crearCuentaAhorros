package Test;

import junit.framework.Assert;
import org.junit.Test;
import utilidades.GArchivos;


public class GestionDatos 
{
    @Test
    public void guardarNull()
    {
        String abc = "jose";
        
        boolean rta = GArchivos.guardar(" ", abc);
        System.out.println(rta);
        Assert.assertEquals(rta,false);
    }
    @Test
    public void guardarNull2()
    {
        boolean rta = GArchivos.guardar(null, null);
        System.err.println(rta);
        Assert.assertEquals(rta, false);
    }
    @Test
    public void guardarOk()
    {
        boolean rta = GArchivos.guardar("Archivos.txt", null);
        System.out.println(rta);
        Assert.assertEquals(rta, false);
    }
    @Test
    public void leerOk()
    {
        String rta = (String)GArchivos.leer("Archivos.txt");
        Assert.assertNull(rta);
    }
}
