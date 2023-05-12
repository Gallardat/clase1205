package com.softtek.presentacion;

import com.softtek.modelo.*;

public class TestVehiculo {
    public static void main(String[] args) {
       Coche coche  = new Coche("Renault","Clio","Blanco",2015);
       System.out.println(coche.moverse());
       Barco barco = new Barco("Guachistru","buebuebue","Azul",100);
       System.out.println(barco.moverse());
       Avion avion = new Avion("Airbus ","A320","Blanco",300);
       System.out.println(avion.moverse());

    }
}
