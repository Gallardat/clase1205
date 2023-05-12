package com.softtek.modelo;

public class Pez extends Animal{
    @Override
    public void comer() {

    }

    @Override
    public void moverse() {

    }
}
/*
*
* ¿ Qué ocurre si no implemento todos los métodos?
        Que la clas eme da error, y para poder hacerlo deberia declararla como abstracta tambien
¿Puedo crear instancias igualmente?
*       no, porque es una plantilla, se puede crear partiendo de una clase que herede de esta clase abstracta
¿Puedo modificar parte de la definición de los métodos abstractos?
*       no, porque es como un contrato,
¿Puedo utilizar polimorfismo?
* si, creando creando objetos de la clases clases que heredan de la clase abstracta como si fueran todas de una misma clase
Crea clases extendiendo la clase Pajaro, por ejemplo Gorrión y Buitre.
¿También son abstractas estas clases?
* no, estas clases heredadas de una clase que a su vez hereda de la clase abstracta no tiene porque ser abstractas ni heredar los metodos
*
* */