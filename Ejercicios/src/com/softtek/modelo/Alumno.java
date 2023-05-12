package com.softtek.modelo;

import java.util.Scanner;


    public class Alumno {
        private String nombre;
        private double[] parcial;

        public Alumno(String nombreCompleto, int numParciales) {
            this.nombre = nombreCompleto;
            this.parcial = new double[numParciales];
        }

        public void setParcial(int numParcial, double calificacion) {
            this.parcial[numParcial-1] = calificacion;
        }

        public double promedioNotas() {
            double suma = 0;
            for (double parcial : this.parcial) {
                suma += parcial;
            }
            return suma / this.parcial.length;
        }

        public void mostrarNotas() {
            System.out.print("Calificaciones: ");
            for (double parcial : this.parcial) {
                System.out.print(parcial + " ");
            }
            System.out.println();
        }

        public String getNombreCompleto() {
            return this.nombre;
        }
    }


