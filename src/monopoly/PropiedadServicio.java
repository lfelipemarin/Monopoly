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
public class PropiedadServicio extends CasillaPropiedad{
    private String tipoServicio;

    public PropiedadServicio(String nombre, int rentaBase, String tipoCasillaPropiedad, int valor, int valorHipoteca) {
        super(nombre, rentaBase, tipoCasillaPropiedad, valor, valorHipoteca);
    }

    /**
     * @return the tipoServicio
     */
    public String getTipoServicio() {
        return tipoServicio;
    }

    /**
     * @param tipoServicio the tipoServicio to set
     */
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
}
