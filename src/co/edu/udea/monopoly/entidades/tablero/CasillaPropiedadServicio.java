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
public class CasillaPropiedadServicio extends CasillaPropiedad{
    private String tipoPropiedadServicio;

    public CasillaPropiedadServicio(String nombre, int rentaBase, String tipoCasillaPropiedad, int valor, int valorHipoteca) {
        super(nombre, rentaBase, tipoCasillaPropiedad, valor, valorHipoteca);
    }

    /**
     * @return the tipoPropiedadServicio
     */
    public String getTipoPropiedadServicio() {
        return tipoPropiedadServicio;
    }

   //public int renta=this.getRenta();
           

    
}

