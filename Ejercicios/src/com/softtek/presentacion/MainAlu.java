package com.softtek.presentacion;

import com.softtek.modelo.Alumno;

public class MainAlu {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Juan Perez", 3);
        alumno.setParcial(1, 7.5);
        alumno.setParcial(2, 8);
        alumno.setParcial(3, 9);
        System.out.println("Las notas: ");
        alumno.mostrarNotas();
        System.out.println("El nombre: " + alumno.getNombreCompleto());
        System.out.println("El promedio de notas: " + alumno.promedioNotas());
    }
}
