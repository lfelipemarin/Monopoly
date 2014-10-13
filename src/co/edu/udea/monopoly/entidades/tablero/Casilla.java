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

    private final int posicion;
    private final String tipoCasilla;

    public Casilla(int posicion, String tipoCasilla) {
        this.posicion = posicion;
        this.tipoCasilla = tipoCasilla;
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
}
