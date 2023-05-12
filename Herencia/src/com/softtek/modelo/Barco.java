package com.softtek.modelo;

public class Barco extends Vehiculo {

    int longitud;

    public Barco(String marca, String modelo, String color,int longitud) {
        super(marca, modelo, color);
        this.longitud = longitud;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    @Override
    public String moverse(){
        return "El barco "+super.moverse();
    }
}
