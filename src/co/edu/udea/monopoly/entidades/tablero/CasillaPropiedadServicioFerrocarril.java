/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.tablero;

/**
 *
 * @author Actualizaciones
 */
public class CasillaPropiedadServicioFerrocarril extends CasillaPropiedadServicio {

    private final String nombreFerrocarril;

    public CasillaPropiedadServicioFerrocarril(int posicion, String nombre,
            int rentaBase, int valor, int valorHipoteca, String nombreFerrocarril) {
        super(posicion, nombre, rentaBase, valor, valorHipoteca);
        this.setTipoCasillaPropiedadServicio(CasillaPropiedadServicio.TIPO_CASILLA_PROPIEDAD_SERVICIO_FERROCARRIL);
        this.nombreFerrocarril = nombreFerrocarril;
    }

    @Override
    public void calculaRenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nombreFerrocarril
     */
    public String getNombreFerrocarril() {
        return nombreFerrocarril;
    }

}
