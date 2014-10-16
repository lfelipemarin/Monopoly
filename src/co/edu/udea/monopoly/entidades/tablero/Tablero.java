/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.tablero;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Tablero {

    private final ArrayList<Casilla> casillas;

    public Tablero() {
        this.casillas = new ArrayList<>();
    }

    public final void fillTablero() {

    }

    public final void crearCasillasEspeciales() {
        Casilla casillaEspecialInicio = new CasillaEspecialParadaLibre(1);
        this.casillas.add(casillaEspecialInicio);

        Casilla casillaEspecialEventualidadArcaComunal3 = new CasillaEspecialEventualidad(3,
                CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_ARCA_COMUN);
        this.casillas.add(casillaEspecialEventualidadArcaComunal3);

        Casilla casillaEspecialImpuesto5 = new CasillaEspecialImpuesto(5);
        this.casillas.add(casillaEspecialImpuesto5);

        Casilla casillaEspecialEventualidadCasualidad8 = new CasillaEspecialEventualidad(8,
                CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_CASUALIDAD);
        this.casillas.add(casillaEspecialEventualidadCasualidad8);

        Casilla casillaEspecialCarcel = new CasillaEspecialCarcel(11);
        this.casillas.add(casillaEspecialCarcel);

        Casilla casillaEspecialEventualidadArcaComun18 = new CasillaEspecialEventualidad(18,
                CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_ARCA_COMUN);
        this.casillas.add(casillaEspecialEventualidadArcaComun18);

        Casilla casillaespecialParadaLibre = new CasillaEspecialParadaLibre(21);
        this.casillas.add(casillaespecialParadaLibre);

        Casilla casillaEspecialCasualidad23 = new CasillaEspecialEventualidad(23,
                CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_CASUALIDAD);
        this.casillas.add(casillaEspecialCasualidad23);

        Casilla casillaEspecialIrCarcel = new CasillaEspecialDelito(31);
        this.casillas.add(casillaEspecialIrCarcel);

        Casilla casillaEspecialEventualidadArcaComun34 = new CasillaEspecialEventualidad(34,
                CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_ARCA_COMUN);
        this.casillas.add(casillaEspecialEventualidadArcaComun34);

        Casilla casillaEspecialEventualidadCasualidad37 = new CasillaEspecialEventualidad(37,
                CasillaEspecialEventualidad.TIPO_CASILLA_ESPECIAL_EVENTUALIDAD_CASUALIDAD);
        this.casillas.add(casillaEspecialEventualidadCasualidad37);

        Casilla casillaEspecialImpuesto39 = new CasillaEspecialImpuesto(39);
        this.casillas.add(casillaEspecialImpuesto39);
    }

    public final void crearCasillasPropieades() {
    }
}
