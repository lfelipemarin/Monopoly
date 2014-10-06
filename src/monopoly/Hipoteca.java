/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly;

/**
 *
 * @author felipe
 */
public class Hipoteca {
    private int interes;
    private Jugador jugador;
    private int monto;
    private PropiedadTerreno propiedad;

    /**
     * @return the interes
     */
    public int getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(int interes) {
        this.interes = interes;
    }

    /**
     * @return the jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * @return the monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }

    /**
     * @return the propiedad
     */
    public PropiedadTerreno getPropiedad() {
        return propiedad;
    }

    /**
     * @param propiedad the propiedad to set
     */
    public void setPropiedad(PropiedadTerreno propiedad) {
        this.propiedad = propiedad;
    }
}
