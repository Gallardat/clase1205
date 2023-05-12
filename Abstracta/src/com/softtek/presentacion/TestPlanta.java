package com.softtek.presentacion;

import com.softtek.modelo.Cactus;
import com.softtek.modelo.Planta;
import com.softtek.modelo.PlantaTropical;

public class TestPlanta {

    public static void main(String[] args) {
        Planta planta = new PlantaTropical("Tropical");
        Planta cactus = new Cactus("Cactus");
        planta.regar(100,4);
        cactus.regar(150 ,5);
    }

}
