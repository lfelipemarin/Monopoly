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
public class CasillaEspecialSueldo extends CasillaEspecial {

    private static final int sueldo = 200;

    public CasillaEspecialSueldo(int posicion, String tipoCasilla) {
        super(posicion, tipoCasilla);
    }

    /**
     * @return the sueldo
     */
    public int getSueldo() {
        return sueldo;
    }

    @Override
    public void ejecutarAccion(Jugador jugador, Banco banco) {
        //se cobra un sueldo de 200 al pasar por la casilla 1
        int dineroJugador = jugador.getCuenta().getDinero();
        jugador.getCuenta().setDinero(dineroJugador + sueldo);
        banco.restarDinero(sueldo);
    }

}
