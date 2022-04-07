package Datos;

public class Cliente 
{
    
    private String nombre;
    private String identificacion;
    private float saldoInicial;
    
    
    public String obNombre()
    {
        return this.nombre;
    }
    public String obIdentificacion()
    {
        return this.identificacion;
    }
    public float obSaldoInicial()
    {
        return this.saldoInicial;
    }
    
    public void modiNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void modiIdentificacion(String identificacion)
    {
        this.identificacion = identificacion;
    }
    public void modiSaldoInicial(float saldoInicial)
    {
        this.saldoInicial = saldoInicial;
    }
    
    @Override
    public String toString()
    {
        return "Cliente "+this.nombre+" con identificación "+this.identificacion;
    }
    public String extraerDigitosIdentificacion()
    {
        char num1 = identificacion.charAt(9);
        char num2 = identificacion.charAt(8);
        char num3 = identificacion.charAt(7);
        char num4 = identificacion.charAt(6);
        
        String Digitos = (Character.toString(num1)+Character.toString(num2)+Character.toString(num3)+Character.toString(num4));
        
        return (Digitos);
        
    }

}
