package com.softtek.modelo;

public class Rectangulo extends Figura {

    double ancho;
    double alto;
    public Rectangulo(int coordenadaX, int coordenadaY,double ancho,double alto) {
        super(coordenadaX, coordenadaY);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String posicion() {
        return "El rectangulo está en la posicion:"+super.posicion()+" tiene un ancho de "+ancho+" y una altura "+alto;
    }
}
