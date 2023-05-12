package com.softtek.modelo;

public class Tren extends Vehiculo{

    String pais;
    public Tren(String marca, String modelo, String color,String pais) {
        super(marca, modelo, color);
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String moverse() {
        return "El tren "+super.moverse();
    }
}
