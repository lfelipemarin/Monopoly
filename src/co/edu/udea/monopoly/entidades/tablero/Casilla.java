/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.tablero;

/**
 *
 * @author felipe
 */
public abstract class Casilla {

    public static final String TIPO_CASILLA_PROPIEDAD = "propiedad";
    public static final String TIPO_CASILLA_ESPECIAL = "especial";

    private final int posicion;
    private String tipoCasilla;

    public Casilla(int posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
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
