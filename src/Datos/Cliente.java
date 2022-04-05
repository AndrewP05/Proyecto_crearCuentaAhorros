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
}
