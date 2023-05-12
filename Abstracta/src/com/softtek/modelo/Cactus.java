package com.softtek.modelo;

public class Cactus extends Planta{
    public Cactus(String tipo) {
        super(tipo);
    }

    @Override
    public void regar(int catidad, int tiempo) {
        System.out.println("Regando la planta "+tipo+" con "+catidad+" ml de agua en "+tiempo+" minutos");

    }
}
