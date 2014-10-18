/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.monopoly.entidades.tarjeta;

/**
 *
 * @author felipe
 */
public class TarjetaPagar extends Tarjeta{
    
    @Override
    public void setTipoTarjeta(String tipoTarjeta) {
        super.setTipoTarjeta(tipoTarjeta); 
    }
    
    @Override
    public void setMensaje(String mensaje) {
       super.setMensaje(mensaje); 
    
       }
    
    @Override
    public void ejecutarAccion() {
       super.ejecutarAccion();
    
       }
    
    @Override
     public String getMensaje() {
       return super.getMensaje();
       
    }
}
