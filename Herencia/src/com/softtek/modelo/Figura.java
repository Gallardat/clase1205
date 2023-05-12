package com.softtek.modelo;

public class Figura {

    private int coordenadaY;
    private int coordenadaX;


    public Figura(int coordenadaX, int coordenadaY) {
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
    }

   public String posicion(){

        return +coordenadaX+","+coordenadaY;
    }
}
