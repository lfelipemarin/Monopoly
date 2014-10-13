/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.juego;

/**
 *
 * @author eux
 */
public class CicloTurnos {

    private final Jugador jugador;
    private int turnosPorPerder;

    public CicloTurnos(Jugador jugador) {
        this.jugador = jugador;
        this.turnosPorPerder = 0;

    }

    /**
     * @return the jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * @return the turnosPorPerder
     */
    public int getTurnosPorPerder() {
        return turnosPorPerder;
    }

    /**
     * @param turnosPorPerder the turnosPorPerder to set
     */
    public void setTurnosPorPerder(int turnosPorPerder) {
        this.turnosPorPerder = turnosPorPerder;
        if (getTurnosPorPerder() < 0) {
            setTurnosPorPerder(0);
        }
    }

    public void bajarSancion() {
        turnosPorPerder--;
        if (getTurnosPorPerder() < 0) {
            setTurnosPorPerder(0);
        }
    }

    public void subirSancion() {
        turnosPorPerder++;
    }

    public void bajarSancion(int i) {
        turnosPorPerder -= i;
        if (getTurnosPorPerder() < 0) {
            setTurnosPorPerder(0);
        }
    }

    public void subirSancion(int i) {
        turnosPorPerder += i;
    }
}
