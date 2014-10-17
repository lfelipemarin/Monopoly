/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.monopoly.entidades.tarjeta;

import co.edu.udea.monopoly.entidades.juego.Banco;
import co.edu.udea.monopoly.entidades.juego.Cuenta;
import co.edu.udea.monopoly.entidades.juego.Juego;
import co.edu.udea.monopoly.entidades.juego.Jugador;

/**
 *
 * @author felipe
 */
public class TarjetaCobrarAcciones extends TarjetaCobrar{

    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta("arcaComun"); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje("Cobrar Acciones $50 "); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void ejecutarAccion(Jugador jugador, Juego juego, Banco banco) {
        int acciones=50;
        int dinero=jugador.getCuenta().getDinero();
        //Se abonan 50 en dinero al jugador por la venta de acciones
        jugador.getCuenta().setDinero(dinero + acciones );
        //Se restan 50 en dinero al banco
        banco.restarDinero(acciones);
        

    }
    
    @Override
    public String getMensaje() {
        return super.getMensaje(); //To change body of generated methods, choose Tools | Templates.
    }
}
