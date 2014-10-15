/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.tablero;

import co.edu.udea.monopoly.entidades.juego.Juego;
import co.edu.udea.monopoly.entidades.juego.Jugador;

/**
 *
 * @author felipe
 */
public class CasillaEspecialEventualidad extends CasillaEspecial {

    private final String tipoCasillaEspecialEventualidad;

    public CasillaEspecialEventualidad(int posicion, String tipoCasilla,
            String tipoCasillaEspecialEventualidad) {
        super(posicion, tipoCasilla);
        this.tipoCasillaEspecialEventualidad = tipoCasillaEspecialEventualidad;
    }

    /**
     * @return the tipoCasillaEspecialEventualidad
     */
    public String getTipoCasillaEspecialEventualidad() {
        return tipoCasillaEspecialEventualidad;
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        /*
         coger una tarjeta segun el tipo de eventualidad y seguir las instrucciones
         */
    }
}
