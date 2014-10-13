/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.tablero;

import co.edu.udea.monopoly.entidades.juego.Jugador;

/**
 *
 * @author felipe
 */
public abstract class CasillaEspecialEventualidad extends CasillaEspecial {

    private String tipoEventualidad;

    public CasillaEspecialEventualidad(int posicion, String tipoCasilla) {
        super(posicion, tipoCasilla);
    }

    /**
     * @return the tipoEventualidad
     */
    public String getTipoEventualidad() {
        return tipoEventualidad;
    }

    /**
     * @param tipoEventualidad the tipoEventualidad to set
     */
    public void setTipoEventualidad(String tipoEventualidad) {
        this.tipoEventualidad = tipoEventualidad;
    }

}
