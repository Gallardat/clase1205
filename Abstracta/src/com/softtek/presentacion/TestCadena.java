package com.softtek.presentacion;

public class TestCadena {
    public static void main(String[] args) {
        //Crear la cadena de texto: “Bienvenidos al curso de Java
        String cadena= "Bienvenidos al curso de Java";
        System.out.println("Creamos la cadena: " + cadena);
        System.out.println("Mostrar la cadena toda en mayúsculas: "+cadena.toUpperCase());
        System.out.println("Mostrar la cadena toda en minusculas: "+cadena.toLowerCase());
        System.out.println("Mostrar solo la palabra Bienvenidos "+cadena.substring(0, 10));
        System.out.println("Mostrar solo la palabra Java: "+cadena.substring(23));
        System.out.println("Mostrar la palabra curso: "+cadena.substring(18, 23));
        System.out.println(" Mostrar la posición de la letra c: "+cadena.indexOf('c'));
        System.out.println("Devolver la longitud de la cadena: "+cadena.length());
        cadena = cadena.replace("e", "E");
        System.out.println("Modificar las e minúsculas por E mayúsculas: "+cadena);
        cadena += " con fecha 14 de Septiembre";
        System.out.println("Concatenar la frase anterior con \"con fecha 14 de Septiembre\": "+cadena);
    }
}
