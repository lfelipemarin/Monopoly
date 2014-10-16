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
public class CasillaPropiedadServicioPublico extends CasillaPropiedadServicio {

    private final String nombreServicioPublico;

    public CasillaPropiedadServicioPublico(int posicion, String nombre,
            int rentaBase, int valor, int valorHipoteca, String nombreServicio) {
        super(posicion, nombre, rentaBase, valor, valorHipoteca);
        this.setTipoCasillaPropiedadServicio(CasillaPropiedadServicio.TIPO_CASILLA_PROPIEDAD_SERVICIO_PUBLICO);
        this.nombreServicioPublico = nombreServicio;
    }

    @Override
    public void calculaRenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nombreServicio
     */
    public String getNombreServicioPublico() {
        return nombreServicioPublico;
    }

}
