/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.monopoly.entidades.tarjeta;

import co.edu.udea.monopoly.entidades.juego.Juego;
import co.edu.udea.monopoly.entidades.juego.Jugador;

/**
 *
 * @author felipe
 */
public class TarjetaIrCasillaCasillaPropiedad extends TarjetaIrCasilla{
@Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Ir a Ilinois"); 
    
       }
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        
    }

    @Override
    public String getMensaje() {
        return super.getMensaje(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
