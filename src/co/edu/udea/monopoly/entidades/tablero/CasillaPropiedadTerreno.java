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

    public static final String COLOR_LIGHT_GREEN = "Light Green";
    public static final String COLOR_VIOLET = "Violet";
    public static final String COLOR_ORANGE = "Orange";
    public static final String COLOR_RED = "Red";
    public static final String COLOR_YELLOW = "Yellow";
    public static final String COLOR_DARK_GREEN = "Dark Green";
    public static final String COLOR_DARK_BLUE = "Dark Blue";
    public static final String COLOR_PURPLE = "Purple";

    private final int costoCasa;
    private final int costoHotel;
    private final String color;
    private final ArrayList<Mejora> mejoras;

    public CasillaPropiedadTerreno(String nombre, int posicion,
            int valor, int rentaBase, int valorHipoteca,
            int costoCasa, int costoHotel, String color) {
        super(posicion, nombre, rentaBase, valor, valorHipoteca);
        this.setTipoCasillaPropiedad(CasillaPropiedad.TIPO_CASILLA_PROPIEDAD_TERRENO);
        this.color = color;
        this.costoCasa = costoCasa;
        this.costoHotel = costoHotel;
        this.mejoras = new ArrayList<>();
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
