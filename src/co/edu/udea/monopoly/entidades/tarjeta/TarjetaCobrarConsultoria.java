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
public class TarjetaCobrarConsultoria extends TarjetaCobrar{
    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Recibe $ 25 Cuota de Consultoría "); 
    
       }
    
     @Override
    public void ejecutarAccion(Jugador jugador, Juego juego, Banco banco) {
        int cobro=25;
        int dinero=jugador.getCuenta().getDinero();
        //Se abonan 25 en dinero al jugador Recibe $ 25 Cuota de Consultoría 
        jugador.getCuenta().setDinero(dinero + cobro );
        //Se restan 25 en dinero al banco
        banco.restarDinero(cobro);
    }
    @Override
    public String getMensaje() {
        return super.getMensaje(); //To change body of generated methods, choose Tools | Templates.
    }
}
