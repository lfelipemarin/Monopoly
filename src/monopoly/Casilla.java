/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly;

/**
 *
 * @author felipe
 */
public abstract class Casilla {
    private int posicion;
    private String tipoCasilla;

    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the tipoCasilla
     */
    public String getTipoCasilla() {
        return tipoCasilla;
    }

    /**
     * @param tipoCasilla the tipoCasilla to set
     */
    public void setTipoCasilla(String tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }
    
}
