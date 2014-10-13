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
public class CasillaEspecialImpuesto extends CasillaEspecial {
    
    private static final int impuestoDeclaracion = 200;
    private static final int impuestoLujos = 75;

    /**
     * @return the impuestoDeclaracion
     */
    public static int getImpuestoDeclaracion() {
        return impuestoDeclaracion;
    }

    /**
     * @return the impuestoLujos
     */
    public static int getImpuestoLujos() {
        return impuestoLujos;
    }
    
    public CasillaEspecialImpuesto(int posicion, String tipoCasilla) {
        super(posicion, tipoCasilla);
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Banco banco) {
        int dineroJugador = jugador.getCuenta().getDinero();
        switch (jugador.getFicha().getPosicion()) {
            case 5:
                //se pagan 200 al caer en la casilla de impuestos numero 5
                jugador.getCuenta().setDinero(dineroJugador - impuestoDeclaracion);
                banco.agregarDinero(impuestoDeclaracion);
                break;
            case 39:
                //se pagan 75 al caer en la casilla de impuestos 39
                jugador.getCuenta().setDinero(dineroJugador - impuestoLujos);
                banco.agregarDinero(impuestoLujos);
                break;
        }
    }
}
