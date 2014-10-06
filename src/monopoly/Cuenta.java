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
public class Cuenta {
    private int dinero;
    private Collection<PropiedadTerreno> propiedades;

    /**
     * @return the dinero
     */
    public int getDinero() {
        return dinero;
    }

    /**
     * @param dinero the dinero to set
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    /**
     * @return the propiedades
     */
    public Collection<PropiedadTerreno> getPropiedades() {
        return propiedades;
    }

    /**
     * @param propiedades the propiedades to set
     */
    public void setPropiedades(Collection<PropiedadTerreno> propiedades) {
        this.propiedades = propiedades;
    }
    
}
