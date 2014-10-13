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
public abstract class CasillaPropiedadServicio extends CasillaPropiedad {

    private final String tipoCasillaPropiedadServicio;

    public CasillaPropiedadServicio(int posicion, String tipoCasilla,
            String nombre, int rentaBase, String tipoCasillaPropiedad, int valor,
            int valorHipoteca, String tipoCasillaPropiedadServicio) {
        super(posicion, tipoCasilla, nombre, rentaBase, tipoCasillaPropiedad, valor, valorHipoteca);
        this.tipoCasillaPropiedadServicio = tipoCasillaPropiedadServicio;
    }

    /**
     * @return the tipoCasillaPropiedadServicio
     */
    public String getTipoCasillaPropiedadServicio() {
        return tipoCasillaPropiedadServicio;
    }

}
