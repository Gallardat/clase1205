package com.softtek.presentacion;

import com.softtek.modelo.Tabla;



public class MainT {
    public static void main(String[] args) {
        Tabla t = new Tabla(4);
        String respuesta = t.multiplicar();
        System.out.println(respuesta);
    }
}
