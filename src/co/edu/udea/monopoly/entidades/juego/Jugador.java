/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.juego;

import co.edu.udea.monopoly.entidades.tablero.CasillaPropiedad;

/**
 *
 * @author felipe
 */
public class Jugador {

    private final String ENCARCELDADO = "encarcelado";
    private final String LIBRE = "libre";
    private final Cuenta cuenta;
    private String estado;
    private final Ficha ficha;
    private final String nombre;

    public Jugador(Ficha ficha, String nombre) {
        this.cuenta = new Cuenta();
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

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /*
     el jugador que invoca este metodo compra la propiedad pasada por parametro
     al banco (pasado tambien como parametro)
     */
    public boolean comprarPropiedad(Banco banco, CasillaPropiedad propiedad) {
        if (banco.borrarPorpiedad(propiedad)) {
            if (getCuenta().agregarPropiedad(propiedad)) {
                propiedad.setEstado(propiedad.ADQUIRIDA);
                return true;
            }
        }
        return false;
    }

    /*
     el jugador que llama este metodo compra la propiedad pasada como parametro 
     al jugador pasado como parametro
     */
    public boolean comprarPropiedad(Jugador jugador, CasillaPropiedad propiedad) {
        if (jugador.getCuenta().borraPropiedad(propiedad)) {
            if (getCuenta().agregarPropiedad(propiedad)) {
                propiedad.setEstado(propiedad.ADQUIRIDA);
                return true;
            }
        }
        return false;
    }

    /*
     el jugador que invoca este metodo vender la propiedad pasada como parametro
     al banco (pasado como parametro)
     */
    public boolean venderPropiedad(Banco banco, CasillaPropiedad propiedad) {
        if (getCuenta().borraPropiedad(propiedad)) {
            if (banco.agregarPropiedad(propiedad)) {
                propiedad.setEstado(propiedad.DISPONIBLE);
                return true;
            }
        }
        return false;
    }

    /*
     el jugador que invoca este emtodo vende la propiedad pasada como parametro
     al jugador pasado como parametro
     */
    public boolean venderPropiedad(Jugador jugador, CasillaPropiedad propiedad) {
        if (getCuenta().borraPropiedad(propiedad)) {
            if (jugador.getCuenta().agregarPropiedad(propiedad)) {
                propiedad.setEstado(propiedad.ADQUIRIDA);
                return true;
            }
        }
        return false;
    }

    /*
     el jugador que invoca este metodo hipoteca la propiedad pasada como
     parametro al banco (pasado como parametro).
    
     la propiedad debe ser del jugador que la hipoteca
     */
    public boolean hipotecar(Banco banco, CasillaPropiedad propiedad) {
        int hipoteca = propiedad.getValorHipoteca();
        if (cuenta.getPropiedades().contains(propiedad)) {
            banco.restarDinero(hipoteca);
            getCuenta().agregarDinero(hipoteca);
            propiedad.setEstado(propiedad.HIPOTECADA);
            return true;
        }
        return false;
    }

    /*
     el jugador que llama este parametro deshipoteca (del banco pasado como parametro)
     la propiedad pasada como parametro.
    
     la propiedad debe ser del jugador que la deshipoteca; un jugador debe primero
     comprar una propiedad hipotecada para poderla deshipotecar
     */
    public boolean deshipotecar(Banco banco, CasillaPropiedad propiedad) {
        int deshipoteca = (int) (propiedad.getValorHipoteca() * 1.1);
        if (cuenta.getPropiedades().contains(propiedad)) {
            if (propiedad.getEstado().equals(propiedad.HIPOTECADA)) {
                if (getCuenta().restarDinero(deshipoteca)) {
                    banco.agregarDinero(deshipoteca);
                    propiedad.setEstado(propiedad.ADQUIRIDA);
                    return true;
                }
            }
        }
        return false;
    }
}
