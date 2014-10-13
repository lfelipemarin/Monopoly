/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.tablero;

/**
 *
 * @author felipe
 */
public abstract class CasillaPropiedad extends Casilla {

    public final String HIPOTECADA = "hipotecada";
    public final String DISPONIBLE = "disponible";
    public final String ADQUIRIDA = "adquirida";
    private String estado;
    private final String nombre;
    private int renta;
    private final int rentaBase;
    private final String tipoCasillaPropiedad;
    private final int valor;
    private final int valorHipoteca;

    public CasillaPropiedad(int posicion, String tipoCasilla, String nombre, int rentaBase, String tipoCasillaPropiedad,
            int valor, int valorHipoteca) {
        super(posicion, tipoCasilla);
        this.nombre = nombre;
        this.rentaBase = rentaBase;
        this.tipoCasillaPropiedad = tipoCasillaPropiedad;
        this.valor = valor;
        this.valorHipoteca = valorHipoteca;
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

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public abstract void calculaRenta();

}
