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
public abstract class CasillaEspecial extends Casilla{
    private String tipoCasillaEspecial;

    /**
     * @return the tipoCasillaEspecial
     */
    public String getTipoCasillaEspecial() {
        return tipoCasillaEspecial;
    }

    /**
     * @param tipoCasillaEspecial the tipoCasillaEspecial to set
     */
    public void setTipoCasillaEspecial(String tipoCasillaEspecial) {
        this.tipoCasillaEspecial = tipoCasillaEspecial;
    }
}
