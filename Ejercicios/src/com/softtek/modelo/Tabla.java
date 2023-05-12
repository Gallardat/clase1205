package com.softtek.modelo;

import java.util.Scanner;

public class Tabla {


    private int x;
    public Tabla(int x) {
        this.x=x;

    }
    public String multiplicar(){
        String respuesta="";
        System.out.println("Tabla del número: "+x);
        for(int i=1;i<=10;i++)
        {
           respuesta+=x+" x "+i+" = "+(x*i)+"\n";
        }
        return respuesta;
    }
}
