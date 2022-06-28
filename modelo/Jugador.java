package modelo;

public class Jugador 
{
    private String nombre;
    private String apellidos;
    private int edad;
    private String posicion;
    private int goles;
    private String seleccionar;

    public Jugador()
    {
        nombre ="";
        apellidos="";
        edad = 0;
        posicion ="";
        goles = 0;
        seleccionar ="";
    }

    public Jugador(String nombre, String apellidos, int edad, String posicion, int goles, String seleccionar)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.posicion = posicion;
        this.goles = goles;
        this.seleccionar = seleccionar;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getGoles() {
        return goles;
    }

    public String getSeleccionar() {
        return seleccionar;
    }

    
    
    
}
