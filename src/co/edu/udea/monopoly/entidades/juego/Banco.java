/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.juego;

import co.edu.udea.monopoly.entidades.tablero.Mejora;
import java.util.Collection;

/**
 *
 * @author felipe
 */
public class Banco {

    private Cuenta cuenta;
    private Collection<Mejora> mejoras;

    public Banco(Cuenta cuenta, Collection<Mejora> mejoras) {
        this.cuenta = cuenta;
        this.mejoras = mejoras;
    }

    /**
     * @return the cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the mejoras
     */
    public Collection<Mejora> getMejoras() {
        return mejoras;
    }

    /**
     * @param mejoras the mejoras to set
     */
    public void setMejoras(Collection<Mejora> mejoras) {
        this.mejoras = mejoras;
    }

}
