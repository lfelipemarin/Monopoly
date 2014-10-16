/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.juego;

import co.edu.udea.monopoly.entidades.tarjeta.Tarjeta;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCarcel;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrar;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaIrCasillaCobrar;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaIrCasillaCobrarInicio;
import co.edu.udea.monopoly.gui.Tablero;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author felipe
 */
public class Juego {

    private final Banco banco;
    private final Turnero turnero;
    private final Tablero tablero;
    private ArrayList<Ficha> fichas;
    private ArrayList<Tarjeta> tarjetasArcaComun;
    private ArrayList<Tarjeta> tarjetasCasualidad;
    private ArrayList<Jugador> jugadores;

    public Juego() {
        banco = new Banco();
        turnero = new Turnero();
        tablero = new Tablero();
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
    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    /**
     * @return the jugadores
     */
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * @return the tarjetasArcaComun
     */
    public ArrayList<Tarjeta> getTarjetasArcaComun() {
        return tarjetasArcaComun;
    }

    /**
     * @return the tarjetasCasualidad
     */
    public ArrayList<Tarjeta> getTarjetasCasualidad() {
        return tarjetasCasualidad;
    }

    public void crearTarjetas() {
        TarjetaIrCasillaCobrarInicio tarjetaIrCasillaCobrar = new TarjetaIrCasillaCobrarInicio();
        TarjetaCobrar tarjeta
    }

}
