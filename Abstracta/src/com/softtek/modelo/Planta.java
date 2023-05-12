package com.softtek.modelo;

public abstract class Planta {
    String tipo;

    public Planta(String tipo) {
        this.tipo = tipo;

    }

    public abstract void regar(int catidad, int tiempo);


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
