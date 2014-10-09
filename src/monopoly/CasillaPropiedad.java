/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.Collection;

/**
 *
 * @author felipe
 */
public class CasillaPropiedad extends Casilla {

    private int estado;
    private int renta;
    private int valor;
    private String tipoPropiedad;
    private Hipoteca hipoteca;

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
     * @return the renta
     */
    public int getRenta() {
        return renta;
    }

    /**
     * @param renta the renta to set
     */
    public void setRenta(int renta) {
        this.renta = renta;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the tipoPropiedad
     */
    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    /**
     * @param tipoPropiedad the tipoPropiedad to set
     */
    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    /**
     * @return the hipoteca
     */
    public Hipoteca getHipoteca() {
        return hipoteca;
    }

    /**
     * @param hipoteca the hipoteca to set
     */
    public void setHipoteca(Hipoteca hipoteca) {
        this.hipoteca = hipoteca;
    }
}
