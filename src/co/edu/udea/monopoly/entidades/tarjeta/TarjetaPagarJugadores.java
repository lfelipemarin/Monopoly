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
public class TarjetaPagarJugadores extends TarjetaPagar{
   @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("casualidades"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Pagar a los demas jugadores $50"); 
       
    }
    
    public void ejecutarAccion(Jugador jugador, Juego juego) {
        int cobro=50;
        int dinero=jugador.getCuenta().getDinero();
        //Se abonan 25 en dinero al jugador 
        jugador.getCuenta().setDinero(dinero - cobro );
        //AQUI ES A LOS DEMAS JUGADORES Y NO AL BANCO
        juego.getBanco().agregarDinero(cobro);
        
    }

    @Override
    public String getMensaje() {
        return super.getMensaje(); //To change body of generated methods, choose Tools | Templates.
    }
}
