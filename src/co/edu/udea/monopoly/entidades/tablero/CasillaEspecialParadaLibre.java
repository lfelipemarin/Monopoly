/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.monopoly.entidades.tablero;

import co.edu.udea.monopoly.entidades.juego.Banco;
import co.edu.udea.monopoly.entidades.juego.Juego;
import co.edu.udea.monopoly.entidades.juego.Jugador;

/**
 *
 * @author felipe
 */
public class CasillaEspecialParadaLibre extends CasillaEspecial{

    public CasillaEspecialParadaLibre(int posicion, String tipoCasilla) {
        super(posicion, tipoCasilla);
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
         //se queda en la misma casilla y no se hace nada.
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
