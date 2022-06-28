package modelo;



public class Equipo 
{
    private String pais;
    private String continente;
    private String nombre;
    private int experiencia;
    private int dia;
    private int mes;
    private int año;
    private int participaciones;
    private int copas;

    public Equipo(String pPais, String pContinente, int pParticipaciones, int pCopas)
    {
        this.pais = pPais;
        this.continente = pContinente;
        this.participaciones = pParticipaciones;
        this.copas = pCopas;
        
    }

    public String getPais() {
        return pais;
    }


    public String getContinente() {
        return continente;
    }

   

    public int getParticipaciones() {
        return participaciones;
    }

    

    public int getCopas() {
        return copas;
    }

    public void director(String nombre, int experiencia, int dia, int mes, int año)
    {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    

}
