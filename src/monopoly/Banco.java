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
public class Banco {
    private Cuenta cuenta;
    private Collection<Hipoteca> hipotecas;
    private Collection<Mejora> mejoras;

    /**
     * @return the cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the hipotecas
     */
    public Collection<Hipoteca> getHipotecas() {
        return hipotecas;
    }

    /**
     * @param hipotecas the hipotecas to set
     */
    public void setHipotecas(Collection<Hipoteca> hipotecas) {
        this.hipotecas = hipotecas;
    }

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
    
    
}
