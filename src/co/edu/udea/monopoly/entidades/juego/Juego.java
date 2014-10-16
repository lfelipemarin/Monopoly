/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.juego;

import co.edu.udea.monopoly.entidades.tablero.Casilla;
import co.edu.udea.monopoly.entidades.tablero.Tablero;
import co.edu.udea.monopoly.entidades.tarjeta.Tarjeta;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCarcelIrCarcel;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCarcelSalirCarcel;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarAcciones;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarBanco;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarConcursoBelleza;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarConsultoria;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarCrucigrama;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarCumpleaños;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarErrorBanco;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarFestivo;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarHerencia;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarImpuestosPrestamos;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarOpera;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarReembolsoImpuesto;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaCobrarSeguroVida;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaIrCasillaCasillaPropiedad;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaIrCasillaCobrarInicio;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaIrCasillaProximaUtilidad;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaIrCasillaTresCasillasAtras;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaPagarArreglosMejoras;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaPagarCasasHoteles;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaPagarDoctor;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaPagarEscuela;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaPagarHospital;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaPagarJugadores;
import co.edu.udea.monopoly.entidades.tarjeta.TarjetaPagarPobres;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Juego {

    private final Banco banco;
    private final Turnero turnero;
    private final Tablero tablero;
    private final ArrayList<Ficha> fichas;
    private final ArrayList<Tarjeta> tarjetasArcaComun;
    private final ArrayList<Tarjeta> tarjetasCasualidad;

    public Juego() {
        this.banco = new Banco();
        this.turnero = new Turnero();
        this.tablero = new Tablero();
        this.fichas = new ArrayList<>();
        this.tarjetasArcaComun = new ArrayList<>();
        this.tarjetasCasualidad = new ArrayList<>();
    }

    public void crearJugador(String nombreJugador, String nombreFicha) {
        Ficha ficha = new Ficha(nombreFicha);
        Jugador jugador = new Jugador(ficha, nombreJugador);
        getFichas().add(ficha);
        getTurnero().agregarJugador(jugador);
    }

    /**
     * @return the banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @return the turnero
     */
    public Turnero getTurnero() {
        return turnero;
    }

    /**
     * @return the tablero
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * @return the fichas
     */
    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public Tarjeta getTarjetaArcaComun() {
        int tarjeta = (int) (Math.random() * tarjetasArcaComun.size() - 1);
        return tarjetasArcaComun.get(tarjeta);
    }

    public Tarjeta getTarjetaCasualidad() {
        int tarjeta = (int) (Math.random() * tarjetasCasualidad.size() - 1);
        return tarjetasCasualidad.get(tarjeta);
    }

    public void crearTarjetas() {

        //tarjetas para el arreglo de tarjetasArcaComun
        TarjetaIrCasillaCobrarInicio tarjetaIrCasillaCobrarInicio = new TarjetaIrCasillaCobrarInicio();
        TarjetaCobrarErrorBanco tarjetaCobrarErrorBanco = new TarjetaCobrarErrorBanco();
        TarjetaPagarDoctor tarjetaPagarDoctor = new TarjetaPagarDoctor();
        TarjetaCarcelSalirCarcel tarjetaCarcelSalirCarcel = new TarjetaCarcelSalirCarcel();
        TarjetaCarcelIrCarcel tarjetaCarcelIrCarcel = new TarjetaCarcelIrCarcel();
        TarjetaCobrarCumpleaños tarjetaCobrarCumpleaños = new TarjetaCobrarCumpleaños();
        TarjetaCobrarOpera tarjetaCobrarOpera = new TarjetaCobrarOpera();
        TarjetaCobrarReembolsoImpuesto tarjetaCobrarReembolsoImpuesto = new TarjetaCobrarReembolsoImpuesto();
        TarjetaCobrarSeguroVida tarjetaCobrarSeguroVida = new TarjetaCobrarSeguroVida();
        TarjetaPagarHospital tarjetaPagarHospital = new TarjetaPagarHospital();
        TarjetaPagarEscuela tarjetaPagarEscuela = new TarjetaPagarEscuela();
        TarjetaCobrarConsultoria tarjetaCobrarConsultoria = new TarjetaCobrarConsultoria();
        TarjetaPagarCasasHoteles tarjetaPagarCasasHoteles = new TarjetaPagarCasasHoteles();
        TarjetaCobrarConcursoBelleza tarjetaCobrarConcursoBelleza = new TarjetaCobrarConcursoBelleza();
        TarjetaCobrarHerencia tarjetaCobrarHerencia = new TarjetaCobrarHerencia();
        TarjetaCobrarAcciones tarjetaCobrarAcciones = new TarjetaCobrarAcciones();
        TarjetaCobrarFestivo tarjetaCobrarFestivo = new TarjetaCobrarFestivo();

        //agrega al arreglo tarjetasArcaComun todas las tarjetas
        tarjetasArcaComun.add(tarjetaIrCasillaCobrarInicio);
        tarjetasArcaComun.add(tarjetaCobrarErrorBanco);
        tarjetasArcaComun.add(tarjetaPagarDoctor);
        tarjetasArcaComun.add(tarjetaCarcelSalirCarcel);
        tarjetasArcaComun.add(tarjetaCarcelIrCarcel);
        tarjetasArcaComun.add(tarjetaCobrarCumpleaños);
        tarjetasArcaComun.add(tarjetaCobrarOpera);
        tarjetasArcaComun.add(tarjetaCobrarReembolsoImpuesto);
        tarjetasArcaComun.add(tarjetaCobrarSeguroVida);
        tarjetasArcaComun.add(tarjetaPagarHospital);
        tarjetasArcaComun.add(tarjetaPagarEscuela);
        tarjetasArcaComun.add(tarjetaCobrarConsultoria);
        tarjetasArcaComun.add(tarjetaPagarCasasHoteles);
        tarjetasArcaComun.add(tarjetaCobrarConcursoBelleza);
        tarjetasArcaComun.add(tarjetaCobrarHerencia);
        tarjetasArcaComun.add(tarjetaCobrarAcciones);
        tarjetasArcaComun.add(tarjetaCobrarFestivo);

        //tarjetas para el arreglo de Casualidad
        TarjetaIrCasillaCasillaPropiedad tarjetaIrIllinois = new TarjetaIrCasillaCasillaPropiedad();
        TarjetaIrCasillaCobrarInicio tarjetaIrCasillaCobrarInicio1 = new TarjetaIrCasillaCobrarInicio();
        TarjetaIrCasillaProximaUtilidad tarjetaIrCasillaProximaUtilidad = new TarjetaIrCasillaProximaUtilidad();
        TarjetaIrCasillaProximaUtilidad tarjetaIrProximoFerro = new TarjetaIrCasillaProximaUtilidad();
        TarjetaIrCasillaProximaUtilidad tarjetaIrProximoFerro1 = new TarjetaIrCasillaProximaUtilidad();
        TarjetaIrCasillaCasillaPropiedad tarjetaIrStCharles = new TarjetaIrCasillaCasillaPropiedad();
        TarjetaCobrarBanco tarjetaCobrarBanco = new TarjetaCobrarBanco();
        TarjetaCarcelSalirCarcel tarjetaCarcelSalirCarcel1 = new TarjetaCarcelSalirCarcel();
        TarjetaIrCasillaTresCasillasAtras tarjetaIrCasillaTresCasillasAtras = new TarjetaIrCasillaTresCasillasAtras();
        TarjetaCarcelIrCarcel tarjetaCarcelIrCarcel1 = new TarjetaCarcelIrCarcel();
        TarjetaPagarArreglosMejoras tarjetaPagarArreglosMejoras = new TarjetaPagarArreglosMejoras();
        TarjetaPagarPobres tarjetaPagarPobres = new TarjetaPagarPobres();
        TarjetaIrCasillaProximaUtilidad tarjetaIrCasillaReadingFerro = new TarjetaIrCasillaProximaUtilidad();
        TarjetaIrCasillaCasillaPropiedad TarjetaIrCasillaBoardWalk = new TarjetaIrCasillaCasillaPropiedad();
        TarjetaPagarJugadores tarjetaPagarJugadores = new TarjetaPagarJugadores();
        TarjetaCobrarImpuestosPrestamos tarjetaCobrarImpuestosPrestamos = new TarjetaCobrarImpuestosPrestamos();
        TarjetaCobrarCrucigrama tarjetaCobrarCrucigrama = new TarjetaCobrarCrucigrama();

        //agrega al arreglo tarjetasCasualidad todas las tarjetas
        tarjetasCasualidad.add(tarjetaIrIllinois);
        tarjetasCasualidad.add(tarjetaIrCasillaCobrarInicio1);
        tarjetasCasualidad.add(tarjetaIrCasillaProximaUtilidad);
        tarjetasCasualidad.add(tarjetaIrProximoFerro);
        tarjetasCasualidad.add(tarjetaIrProximoFerro1);
        tarjetasCasualidad.add(tarjetaIrStCharles);
        tarjetasCasualidad.add(tarjetaCobrarBanco);
        tarjetasCasualidad.add(tarjetaCarcelSalirCarcel1);
        tarjetasCasualidad.add(tarjetaIrCasillaTresCasillasAtras);
        tarjetasCasualidad.add(tarjetaCarcelIrCarcel1);
        tarjetasCasualidad.add(tarjetaPagarArreglosMejoras);
        tarjetasCasualidad.add(tarjetaPagarPobres);
        tarjetasCasualidad.add(tarjetaIrCasillaReadingFerro);
        tarjetasCasualidad.add(TarjetaIrCasillaBoardWalk);
        tarjetasCasualidad.add(tarjetaPagarJugadores);
        tarjetasCasualidad.add(tarjetaCobrarImpuestosPrestamos);
        tarjetasCasualidad.add(tarjetaCobrarCrucigrama);
    }

    public void jugar() {
        turnero.proximoJugador();
        Jugador jugador = turnero.getJugadorEnTurno();
        int valorDados;
        valorDados = turnero.tirarDados();
        jugador.getFicha().aumentarPosicion(valorDados);
        int pos = jugador.getFicha().getPosicion();
        if (tablero.getCasillaByPos(pos).getTipoCasilla().equals(Casilla.TIPO_CASILLA_PROPIEDAD)) {

        }
    }

}
