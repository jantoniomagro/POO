import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Pacman. Práctica POO - UNED. CA Motril
 * 
 * @author José Antonio Magro Cortés
 * @version 0.1
 */
class Tablero extends JFrame implements KeyListener, ActionListener {

    private final int NUM_FILAS = 8;
    private final int NUM_COLUMNAS = 8;
    private final int ANCHO_CASILLA = 40;
    private final int ALTO_CASILLA = 40;
    private final int NUM_FICHAS = 8;

    private int posX = 0;
    private int posY = 0;
    private int contadorX = 0;
    private int contadorY = 0;

    private JLabel fondo = new JLabel();

    // casillas de tablero
    JButton[][] posicion = new JButton[NUM_FILAS][NUM_COLUMNAS];

    // iconos
    /*private Icon iconoPacman = new ImageIcon("images/pacman.png");
    private Icon iconoFantasmaUno = new ImageIcon("images/uno.png");
    private Icon iconoFantasmaDos = new ImageIcon("images/dos.png");
    private Icon iconoFantasmaTres = new ImageIcon("images/tres.png");
    private Icon iconoPunto = new ImageIcon("images/punto.png");*/

    /**
     * Constructor para objetos de la clase Tablero
     */
    public Tablero() {

        fondo.setBounds(0, 0, NUM_FILAS*50, NUM_COLUMNAS*50);

        for(int i=0; i<NUM_FILAS; i++) {

            for(int j=0; j<NUM_COLUMNAS; j++) {

                posicion[i][j] = new JButton("");
                if(contadorX%NUM_FILAS==0) {
                    posX += ANCHO_CASILLA;
                }
                contadorX++;

                if(contadorY%NUM_COLUMNAS==0) {
                    posY = 0;
                }
                posY += ALTO_CASILLA;
                contadorY++;

                posicion[i][j].setBounds(posX, posY, ANCHO_CASILLA, ALTO_CASILLA);
                add(posicion[i][j]);

                // botones blancos para que parezcan casillas
                posicion[i][j].setBackground(Color.WHITE);  

            }

        }

        // disposición
        setLayout(null); 
        setSize(NUM_FILAS*50,NUM_COLUMNAS*50);
        setLocation(50, 50);
        setVisible(true);
        setTitle("Pacman - Práctica POO - UNED");

        // escuchando...
        for(int i=0; i<NUM_FILAS; i++) {
            for(int j=0; j<NUM_COLUMNAS; j++) {
                posicion[i][j].addActionListener(this);
                posicion[i][j].addKeyListener(this);
            }
        }

        iniciarJuego();

    }

    ////////////////////////////////////////////////////////////
    /** Handle the key typed event from the text field. */
    public void keyTyped(KeyEvent e) {
        /*posicion[2][4].setIcon(null);
        posicion[3][5].setIcon(iconoPacman);*/
    }

    /** Handle the key pressed event from the text field. */
    public void keyPressed(KeyEvent e) {
    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
    }
    ////////////////////////////////////////////////////////////

    public void actionPerformed (ActionEvent e) {
    }

    public void iniciarJuego() {
        // esto es para ver sólo cómo quedaría, la posición obviamente debe ser aleatoria
        /*posicion[0][0].setIcon(iconoPunto);
        posicion[0][7].setIcon(iconoPunto);
        posicion[7][0].setIcon(iconoPunto);
        posicion[7][6].setIcon(iconoPunto);
        posicion[3][3].setIcon(iconoFantasmaUno);
        posicion[4][6].setIcon(iconoFantasmaDos);
        posicion[5][2].setIcon(iconoFantasmaTres);
        posicion[2][4].setIcon(iconoPacman);*/
        Rojo rojo = new Rojo();
        Verde verde = new Verde();
        Naranja naranja = new Naranja();
        Comecocos comecocos = new Comecocos();

    }

    public static void main (String args[]) {
        new Tablero();
    }

}