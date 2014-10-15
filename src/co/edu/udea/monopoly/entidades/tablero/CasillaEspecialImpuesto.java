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
public class CasillaEspecialImpuesto extends CasillaEspecial {

    public final int IMPUESTO_DECLARACION = 200;
    public final int IMPUESTO_LUJOS = 75;

    public CasillaEspecialImpuesto(int posicion, String tipoCasilla) {
        super(posicion, tipoCasilla);
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int dineroJugador = jugador.getCuenta().getDinero();
        switch (jugador.getFicha().getPosicion()) {
            case 5:
                //se pagan 200 al caer en la casilla de impuestos numero 5
                jugador.getCuenta().setDinero(dineroJugador - IMPUESTO_DECLARACION);
                juego.getBanco().agregarDinero(IMPUESTO_DECLARACION);
                break;
            case 39:
                //se pagan 75 al caer en la casilla de impuestos 39
                jugador.getCuenta().setDinero(dineroJugador - IMPUESTO_LUJOS);
                juego.getBanco().agregarDinero(IMPUESTO_LUJOS);
                break;
        }
    }
}
