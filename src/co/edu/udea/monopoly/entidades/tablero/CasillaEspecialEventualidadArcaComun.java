/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.tablero;

import co.edu.udea.monopoly.entidades.juego.Banco;
import co.edu.udea.monopoly.entidades.juego.Jugador;

/**
 *
 * @author felipe
 */
public class CasillaEspecialEventualidadArcaComun extends CasillaEspecialEventualidad {

    public CasillaEspecialEventualidadArcaComun(int posicion, String tipoCasilla) {
        super(posicion, tipoCasilla);
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Banco banco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
