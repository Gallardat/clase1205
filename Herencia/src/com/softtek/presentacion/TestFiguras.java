package com.softtek.presentacion;

import com.softtek.modelo.Circulo;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Rectangulo;

public class TestFiguras {

    public static void main(String[] args) {
        Figura figura = new Figura(20,40);
        System.out.println(figura.posicion());
        Circulo circulo=new Circulo(10,20,5);
        System.out.println(circulo.posicion());
        Rectangulo rectangulo=new Rectangulo(10,20,5,4);
        System.out.println(rectangulo.posicion());

    }
}
