package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
        //---------------
    // Atributos
    // --------------
    public JButton btDirector;
    public JButton btJugador;
    public JButton btInformacion;
    public JButton btSalir;
    public JButton btBorrar;
    private Color colorAmarillo = new Color(249, 231, 159);

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelOperaciones()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(colorAmarillo);

        //crear y agregar boton hallar
        btDirector = new JButton("Director");
        btDirector.setBounds(30,40,120,30);
        this.add(btDirector);
        btDirector.setActionCommand("director");
        btDirector.setEnabled(false);

        // crear y agregar boton borrar
        btJugador = new JButton("Jugador");
        btJugador.setBounds(170,40,100,30);
        this.add(btJugador);
        btJugador.setActionCommand("jugador");
        btJugador.setEnabled(false);

        btInformacion = new JButton("Informacion");
        btInformacion.setBounds(290,40,130,30);
        this.add(btInformacion);
        btInformacion.setActionCommand("informacion");

        // crear y agregar boton salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(550,40,100,30);
        this.add(btSalir);
        btSalir.setActionCommand("Salir");

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(440,40,100,30);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void activarBotones()
    {
        btDirector.setEnabled(true);
        btJugador.setEnabled(true);
    }
}