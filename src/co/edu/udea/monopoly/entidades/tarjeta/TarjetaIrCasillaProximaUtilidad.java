/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.monopoly.entidades.tarjeta;

import co.edu.udea.monopoly.entidades.juego.Juego;
import co.edu.udea.monopoly.entidades.juego.Jugador;
import co.edu.udea.monopoly.entidades.tablero.CasillaPropiedadServicio;

/**
 *
 * @author felipe
 */
public class TarjetaIrCasillaProximaUtilidad extends TarjetaIrCasilla{

    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Avanza al proximo ferrocarril o servicio publico y paga doble renta, Si no tiene dueño puedes comprar"); 
       
    }
    
    public void ejecutarAccion(Jugador jugador, Juego juego) {
//        int renta =CasillaPropiedadServicio.
//        int pos =jugador.pagarRenta(null)
//        jugador.getFicha().setPosicion(pos - 3);
        }
    

    @Override
    public String getMensaje() {
        return super.getMensaje(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
