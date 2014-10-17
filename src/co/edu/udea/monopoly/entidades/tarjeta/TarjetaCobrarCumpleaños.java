/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.monopoly.entidades.tarjeta;

import co.edu.udea.monopoly.entidades.juego.Banco;
import co.edu.udea.monopoly.entidades.juego.Juego;
import co.edu.udea.monopoly.entidades.juego.Jugador;

/**
 *
 * @author felipe
 */
public class TarjetaCobrarCumpleaños extends TarjetaCobrar{
   @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Es tu cumpleaños Recibe $ 10 de cada jugador"); 
    
       }
    
     @Override
    public void ejecutarAccion(Jugador jugador, Juego juego, Banco banco) {
        int cobro=10;
        //Recorrer o restar a cada jugador 10 
//        int dinero=jugador.getCuenta().getDinero();
////        Se abonan 25 en dinero al jugador Recibe $ 25 Cuota de Consultoría 
//        jugador.getCuenta().setDinero(dinero + cobro );
////        Se restan 25 en dinero al banco
//        banco.restarDinero(cobro);
//        

    }
}
