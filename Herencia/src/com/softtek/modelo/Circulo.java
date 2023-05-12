package com.softtek.modelo;

public class Circulo extends Figura{
    double radio;


    public Circulo(int coordenadaX, int coordenadaY, double radio) {
        super(coordenadaX, coordenadaY);
        this.radio = radio;
    }
    @Override
    public String posicion() {

        return "Círculo está en la posicion " + super.posicion() + " con radio " + radio;
    }
}
