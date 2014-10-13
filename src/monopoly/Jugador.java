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
public class Jugador {

    private Cuenta cuenta;
    private int estado;
    private final Ficha ficha;
    private final String nombre;

    public Jugador(Ficha ficha, String nombre) {
        this.ficha = ficha;
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the ficha
     */
    public Ficha getFicha() {
        return ficha;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

}
