package com.softtek.modelo;

public class Avion extends Vehiculo {
    int numPasajeros;

    public Avion(String marca, String modelo, String color, int numPasajeros) {
        super(marca, modelo, color);
        this.numPasajeros = numPasajeros;
    }
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    @Override
    public String moverse()
    {
       return "El avion "+super.moverse();
    }

}
