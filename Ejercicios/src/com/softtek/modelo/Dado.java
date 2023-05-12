package com.softtek.modelo;

import java.util.Scanner;
public class Dado {


    public Dado() {
        jugar();
    }
    public void jugar(){
        Scanner teclado= new Scanner(System.in);
        String resp;
        do{
            lanzar();
            System.out.println();
            System.out.println("Escriba s para continuar n para salir");
            resp=teclado.nextLine();
        }while(resp.equals("s")||resp.equals("S"));
        teclado.close();
        System.out.println("Terminó el juego");
    }
    public void lanzar(){
        int dado=(int)(Math.random()*6)+1;
        System.out.println("Salió "+dado);
        dibujar1(dado);
    }
    public void dibujar1(int dado){
       for(int i=0;i<dado;i++){
           System.out.print("* ");
       }
    }
}
