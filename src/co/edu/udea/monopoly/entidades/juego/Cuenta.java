/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.juego;

import co.edu.udea.monopoly.entidades.tablero.CasillaPropiedad;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Cuenta {
    
    private int dinero;
    private final ArrayList<CasillaPropiedad> propiedades;
    
    public Cuenta() {
        this.propiedades = new ArrayList<>();
    }
    
    public void agregarPropiedad(CasillaPropiedad p) {
        propiedades.add(p);
    }
    
    public void borraPropiedad(CasillaPropiedad propiedad) {
        propiedades.remove(propiedad);
//        for (CasillaPropiedad p : propiedades) {
//            if (p.equals(propiedad)) {
//                propiedades.remove(p);
//            }
//        }
    }

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
    public ArrayList<CasillaPropiedad> getPropiedades() {
        return propiedades;
    }
    
}
