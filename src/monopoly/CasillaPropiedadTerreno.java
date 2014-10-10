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
public class CasillaPropiedadTerreno extends CasillaPropiedad {

    private Collection<Mejora> mejoras;
    private String color;

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

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

}
