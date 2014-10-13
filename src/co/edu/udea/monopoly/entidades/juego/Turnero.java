/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.juego;

import java.util.ArrayList;

/**
 *
 * @author eux
 */
public class Turnero {

    private final Dado dadoA;
    private final Dado dadoB;
    private final ArrayList<CicloTurnos> cicloTurnos;
    private Jugador jugadorEnTurno;

    public Turnero() {
        this.dadoA = new Dado();
        this.dadoB = new Dado();
        this.cicloTurnos = new ArrayList<>();
    }

    public int tirarDados() {
        return dadoA.getNumero() + dadoB.getNumero();
    }

    public void agregarJugador(Jugador jugador) {
        getCicloTurnos().add(new CicloTurnos(jugador));
    }

    public void proximoJugador() {
        for (int i = 0; i < getCicloTurnos().size(); i++) {
            if (getCicloTurnos().get(i).getJugador().equals(getJugadorEnTurno())) {
                setJugadorEnTurno(getCicloTurnos().get(i + 1).getJugador());
                if (getCicloTurnos().get(i + 1).getTurnosPorPerder() > 0) {
                    getCicloTurnos().get(i + 1).bajarSancion();
                    proximoJugador();
                    return;
                }
            }
        }
    }

    /**
     * @return the jugadorEnTurno
     */
    public Jugador getJugadorEnTurno() {
        return jugadorEnTurno;
    }

    /**
     * @return the cicloJugadores
     */
    public ArrayList<CicloTurnos> getCicloTurnos() {
        return cicloTurnos;
    }

    /**
     * @param jugadorEnTurno the jugadorEnTurno to set
     */
    public void setJugadorEnTurno(Jugador jugadorEnTurno) {
        this.jugadorEnTurno = jugadorEnTurno;
    }

}
