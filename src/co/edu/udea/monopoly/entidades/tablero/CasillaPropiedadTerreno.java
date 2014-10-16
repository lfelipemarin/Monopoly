/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.monopoly.entidades.tablero;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author felipe
 */
public class CasillaPropiedadTerreno extends CasillaPropiedad {

    private final String COLOR_CAFE = "cafe";
    private final String COLOR_AZUL_CLARO = "azul claro";
    private final String COLOR_AZUL_MORADO = "morado";
    private final String COLOR_NARANJA = "naranja";
    private final String COLOR_ROJO = "rojo";
    private final String COLOR_AMARILLO = "amarillo";
    private final String COLOR_VERDE = "verde";
    private final String COLOR_AZUL_OSCURO = "azul oscuro";
    private final int costoCasa;
    private final int costoHotel;
    private final String color;
    private ArrayList<Mejora> mejoras;

    public CasillaPropiedadTerreno(int posicion, String tipoCasilla,
            String nombre, int rentaBase, String tipoCasillaPropiedad, int valor,
            int valorHipoteca, int costoCasa, int costoHotel, String color) {
        super(posicion, tipoCasilla, nombre, rentaBase, tipoCasillaPropiedad, valor, valorHipoteca);
        this.color = color;
        this.costoCasa = costoCasa;
        this.costoHotel = costoHotel;
    }

    /**
     * @return the costoCasa
     */
    public int getCostoCasa() {
        return costoCasa;
    }

    /**
     * @return the costoHotel
     */
    public int getCostoHotel() {
        return costoHotel;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the mejoras
     */
    public Collection<Mejora> getMejoras() {
        return mejoras;
    }

    public void addMejora(Mejora mejora) {
        int contCasas;
        if (mejoras.isEmpty() == true && mejora.getTipoMejora().equals("hotel")) {
            System.out.println("Un hotel sin casa? traqueto o que?");
        } else if (mejoras.isEmpty() == true && mejora.getTipoMejora().equals("casa")) {
            mejoras.add(mejora);
        } else {
            contCasas = cuentaCasas();
            if (contCasas < 4 && mejora.getTipoMejora().equals("casa")) {
                mejoras.add(mejora);
            } else {
                System.out.print("No mas espacio para casas, se agrega un hotel");
                for (Mejora mejora1 : mejoras) {    //hacer un metodo para remover todas las casas de una.
                    if (mejora1.getTipoMejora().equals("casa")) {
                        mejoras.remove(mejora1);
                    }
                }
                mejoras.add(mejora);
            }
        }
    }

    public void removeMejora(String tipoMejora) {
        for (Mejora mejora : mejoras) {
            if (mejora.getTipoMejora().equals(tipoMejora)) {
                mejoras.remove(mejora);
                return;
            }
        }
    }

    @Override
    public void calculaRenta() {
        int renta = getRentaBase();
        if (mejoras.isEmpty() == true) {
            setRenta(renta);
        } else {
            for (Mejora mejora : mejoras) {
                switch (mejora.getTipoMejora()) {
                    case "casa":
                        renta += renta + costoCasa;
                        break;
                    case "hotel":
                        renta += renta + costoHotel;
                        break;
                }
            }
            setRenta(renta);
        }
    }

    public int cuentaCasas() {
        int contCasas = 0;
        for (Mejora mejora1 : mejoras) {
            if (mejora1.getTipoMejora().equals("casa")) {
                contCasas++;
            }
        }
        return contCasas;
    }

    public int cuentaHoteles() {
        int contHoteles = 0;
        for (Mejora mejora1 : mejoras) {
            if (mejora1.getTipoMejora().equals("hotel")) {
                contHoteles++;
            }
        }
        return contHoteles;
    }
}
