import javax.swing.*;

/**
 * Clase que describe los actores del juego
 * 
 * @author José Antonio Magro Cortés
 * @version 27/04/2014
 */

public abstract class Actor {

    private String nombre;
    protected Icon icono;

    /**
     * Constructor para los objetos de la clase Actor
     */
    public Actor() {
    }

    void setIcono(Icon icono) {
        this.icono = icono;
    }

    Icon getIcono() {
        return this.icono;
    }
    
    abstract void setPosicion(int fila, int columna);
    
    abstract int getPosicion(int fila, int columna);

    abstract void moverse();

}
