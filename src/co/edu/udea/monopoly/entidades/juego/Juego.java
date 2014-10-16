/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.juego;

import co.edu.udea.monopoly.entidades.tablero.Casilla;
import co.edu.udea.monopoly.entidades.tablero.CasillaPropiedad;
import co.edu.udea.monopoly.entidades.tablero.CasillaPropiedadTerreno;
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
import co.edu.udea.monopoly.gui.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felipe
 */
public class Juego {

    private final Banco banco;
    private final Turnero turnero;
    private final Tablero tablero;
    private final GUI gui;
    private final ArrayList<Ficha> fichas;
    private final ArrayList<Tarjeta> tarjetasArcaComun;
    private final ArrayList<Tarjeta> tarjetasCasualidad;

    public Juego() {
        this.turnero = new Turnero();
        this.tablero = new Tablero();
        this.banco = new Banco(tablero.getCasillas());
        this.gui = new GUI();
        this.fichas = new ArrayList<>();
        this.tarjetasArcaComun = new ArrayList<>();
        this.tarjetasCasualidad = new ArrayList<>();
        crearJugador("juno", "funo");
        crearJugador("jdos", "fdos");
        crearJugador("jtres", "ftres");
        this.gui.getJButtonLanzar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jugar();
            }
        });
        this.fillTablaJugadores();
        this.turnero.setJugadorEnTurno(turnero.getCicloTurnos().get(0).getJugador());
    }

    public final void crearJugador(String nombreJugador, String nombreFicha) {
        Ficha ficha = new Ficha(nombreFicha);
        Jugador jugador = new Jugador(ficha, nombreJugador);
        getFichas().add(ficha);
        getTurnero().agregarJugador(jugador);
    }

    public final void fillTablaJugadores() {
        DefaultTableModel modelo = (DefaultTableModel) gui.getTablaJugadores().getModel();
        modelo.setRowCount(0);
        for (CicloTurnos c : turnero.getCicloTurnos()) {
            Object[] row = new Object[2];
            row[0] = c.getJugador().getNombre();
            row[1] = c.getJugador().getFicha().getPosicion();
            modelo.addRow(row);
        }        
        gui.getTablaJugadores().setModel(modelo);
        gui.getTablaJugadores().changeSelection(0, 0, false, false);
        gui.getTablaJugadores().repaint();
        gui.getTablaJugadores().revalidate();
    }

    public void resaltarJugadorEnTurno() {

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
//        tarjetasCasualidad.add(tarjetaPagarArreglosMejoras);
        tarjetasCasualidad.add(tarjetaPagarPobres);
        tarjetasCasualidad.add(tarjetaIrCasillaReadingFerro);
        tarjetasCasualidad.add(TarjetaIrCasillaBoardWalk);
        tarjetasCasualidad.add(tarjetaPagarJugadores);
        tarjetasCasualidad.add(tarjetaCobrarImpuestosPrestamos);
        tarjetasCasualidad.add(tarjetaCobrarCrucigrama);
    }

    public void jugar() {

        Jugador jugador = turnero.getJugadorEnTurno();
        int valorDados;
        valorDados = turnero.tirarDados();
//        valorDados = 16;
        jugador.getFicha().aumentarPosicion(valorDados);
        int pos = jugador.getFicha().getPosicion();
        Casilla casilla = tablero.getCasillaByPos(pos);
        JOptionPane.showMessageDialog(gui, "El jugador " + jugador.getNombre() + "\ncalló en la posicion " + pos);
        switch (casilla.getTipoCasilla()) {
            case Casilla.TIPO_CASILLA_PROPIEDAD:
                JOptionPane.showMessageDialog(gui, "Propiedad");
                CasillaPropiedad propiedad = (CasillaPropiedad) casilla;
                switch (propiedad.getTipoCasillaPropiedad()) {
                    case CasillaPropiedad.TIPO_CASILLA_PROPIEDAD_TERRENO:
                        JOptionPane.showMessageDialog(gui, "Terreno");
                        CasillaPropiedadTerreno terreno = (CasillaPropiedadTerreno) propiedad;
                        switch (terreno.getEstado()) {
                            case CasillaPropiedad.ADQUIRIDA:
                                JOptionPane.showMessageDialog(gui, "Adquirida");
                                if (!jugador.getCuenta().getPropiedades().contains(terreno)) {
                                    JOptionPane.showMessageDialog(gui, "Paga renta.");
                                    terreno.getPropietario().cobrarRenta(terreno, jugador);
                                    return;
                                }
                                JOptionPane.showMessageDialog(gui, "Propia, no paga renta.");
                                break;
                            case CasillaPropiedad.DISPONIBLE:
                                JOptionPane.showMessageDialog(gui, "Disponible");
                                int opcion = JOptionPane.showConfirmDialog(gui, "Desea comprar esta propiedad?");
                                if (opcion == 0) {
                                    jugador.comprarPropiedad(banco, terreno);
                                }
                                break;

                            case CasillaPropiedad.HIPOTECADA:
                                JOptionPane.showMessageDialog(gui, "Hhipotecada.\n"
                                        + "no se paga renta.");
                                break;
                        }
                        break;
                    case CasillaPropiedad.TIPO_CASILLA_PROPIEDAD_SERVICIO:
                        JOptionPane.showMessageDialog(gui, "Servicio");
//                        CasillaPropiedadServicio servicio = (CasillaPropiedadServicio) propiedad;
                        break;
                }
                break;
            case Casilla.TIPO_CASILLA_ESPECIAL:
                JOptionPane.showMessageDialog(gui, "Especial");
                break;
        }
        turnero.proximoJugador();
        fillTablaJugadores();
    }
}
