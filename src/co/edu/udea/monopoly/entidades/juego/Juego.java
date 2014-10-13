/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.juego;

import co.edu.udea.monopoly.entidades.tarjeta.Tarjeta;
import co.edu.udea.monopoly.gui.Tablero;
import java.util.Collection;

/**
 *
 * @author felipe
 */
public class Juego {

    private Banco banco;
    private Turnero turnero;
    private Tablero tablero;
    private Collection<Ficha> fichas;
    private Collection<Tarjeta> tarjetas;
    private Collection<Jugador> jugadores;

    public void juegoNuevo() {
        banco = new Banco();
        turnero = new Turnero();
        tablero = new Tablero();
        getTablero().setVisible(true);
    }

    public void crearJugador(String nombreJugador, String nombreFicha) {
        Ficha ficha = new Ficha(nombreFicha);
        Jugador jugador = new Jugador(ficha, nombreJugador);
        getFichas().add(ficha);
        getJugadores().add(jugador);
    }

    /**
     * @return the banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @return the turnero
     */
    public Turnero getTurnero() {
        return turnero;
    }

    /**
     * @return the tablero
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * @return the fichas
     */
    public Collection<Ficha> getFichas() {
        return fichas;
    }

    /**
     * @return the tarjetas
     */
    public Collection<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    /**
     * @return the jugadores
     */
    public Collection<Jugador> getJugadores() {
        return jugadores;
    }
}
