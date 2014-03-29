import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TableroMatriz extends JFrame implements ActionListener {

    private final int NUM_FILAS = 8;
    private final int NUM_COLUMNAS = 8;
    private final int ANCHO_CASILLA = 40;
    private final int ALTO_CASILLA = 40;

    int posX = 0;
    int posY = 0;
    int contadorX = 0;
    int contadorY = 0;

    JLabel fondo = new JLabel();

    // casillas de tablero
    JButton[][] posicion = new JButton[NUM_FILAS][NUM_COLUMNAS];

    // iconos
    Icon iconoPacman = new ImageIcon("images/pacman.png");
    Icon iconoFantasmaUno = new ImageIcon("images/uno.png");
    Icon iconoFantasmaDos = new ImageIcon("images/dos.png");
    Icon iconoFantasmaTres = new ImageIcon("images/tres.png");
    Icon iconoPunto = new ImageIcon("images/punto.png");

    public TableroMatriz() {

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
                
				// esto es para ver sólo cómo quedaría, la posición obviamente debe ser aleatoria
                if ((i==0 && j==0) || (i==0 && j==7) || (i==7 && j==0) || (i==7 && j==6)) {
                    posicion[i][j].setIcon(iconoPunto);
                } else if (i==3 && j==3) {
                    posicion[i][j].setIcon(iconoFantasmaUno);
                } else if (i==4 && j==6) {
                    posicion[i][j].setIcon(iconoFantasmaDos);
                } else if (i==5 && j==2) {
                    posicion[i][j].setIcon(iconoFantasmaTres);
                } else if (i==2 && j==4) {
                    posicion[i][j].setIcon(iconoPacman);
                }

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
            }
        }

    }

    public void actionPerformed (ActionEvent e) {

    }

    public static void main (String args[]) {
        new TableroMatriz();
    }

}