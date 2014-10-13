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

    public CasillaPropiedadServicioFerrocarril(int posicion, String tipoCasilla,
            String nombre, int rentaBase, String tipoCasillaPropiedad, int valor,
            int valorHipoteca, String tipoCasillaPropiedadServicio, String nombreFerrocarril) {
        super(posicion, tipoCasilla, nombre, rentaBase, tipoCasillaPropiedad,
                valor, valorHipoteca, tipoCasillaPropiedadServicio);
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
