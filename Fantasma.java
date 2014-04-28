import javax.swing.*;

/**
 * Clase Fantasma que permitirá crear tantos subtipos como enemigos tenga pacman
 * 
 * @author José Antonio Magro Cortés 
 * @version 28/04/2014
 */
public abstract class Fantasma extends Actor {


    /**
     * Constructor for objects of class Fantasma
     */
    public Fantasma() {

    }
    
    abstract void setPosicion(int fila, int columna);
    abstract int getPosicion(int fila, int columna);
    


}
