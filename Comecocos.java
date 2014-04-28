import javax.swing.*;

/**
 * Write a description of class Comecocos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comecocos extends Actor {
 
    /**
     * Constructor para el comecocos
     */
    public Comecocos() {
        this.icono = new ImageIcon("images/pacman.png");
    }

    void moverse() {
    }
    
    void setPosicion(int fila, int columna){};
    int getPosicion(int fila, int columna){return 1;};

}
