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
public abstract class CasillaPropiedad extends Casilla {

    private int estado;
    private final String nombre;
    private int renta;
    private final int rentaBase;
    private final String tipoCasillaPropiedad;
    private final int valor;
    private final int valorHipoteca;

    public CasillaPropiedad(String nombre, int rentaBase, String tipoCasillaPropiedad,
            int valor, int valorHipoteca) {
        this.nombre = nombre;
        this.rentaBase = rentaBase;
        this.tipoCasillaPropiedad = tipoCasillaPropiedad;
        this.valor = valor;
        this.valorHipoteca = valorHipoteca;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
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
     * @return the rentaBase
     */
    public int getRentaBase() {
        return rentaBase;
    }

    /**
     * @return the tipoCasillaPropiedad
     */
    public String getTipoCasillaPropiedad() {
        return tipoCasillaPropiedad;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @return the valorHipoteca
     */
    public int getValorHipoteca() {
        return valorHipoteca;
    }

}
