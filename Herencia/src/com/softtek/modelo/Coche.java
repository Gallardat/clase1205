package com.softtek.modelo;

public class Coche extends Vehiculo {

    private int anio;
        public Coche(String marca, String modelo, String color, int anio) {
            super(marca, modelo, color);
            this.anio = anio;
        }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public String moverse(){
        return "El coche "+super.moverse();
    }


}
