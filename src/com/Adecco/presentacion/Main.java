package com.Adecco.presentacion;

import com.Adecco.modelo.Campo;
import com.Adecco.modelo.Coche;
import com.Adecco.modelo.Animal;

public class Main {
    //Clase abierta
    public static void main(String[] args) {
        //Método
        System.out.println("Hello world!");

        variables();
        metodoPoo();
        crearObjetosAnimal();
        campo();
    }

    private static void campo() {
        Campo ca1= new Campo();
        ca1.incrementar();
        ca1.incrementar();
        System.out.println(ca1.mostrarInfo());
    }

    private static void crearObjetosAnimal() {
        //Crear un objeto/instanciar la clase
        Animal a1= new Animal(); //Animal() es un constructor. Si hay un constructor ya no lo genera.
        //Nosotros no lo hemos programado, si no que se genera automáticamente.
        a1.numPatas=4;
        a1.especie="Marina";
        a1.color="Negro";
        a1.peligroExt= true;
        System.out.println("Número de patas: " +a1.numPatas);
        System.out.println("Es de la especie: " +a1.especie);
        System.out.println("Su color es: " +a1.color);
        System.out.println("¿Está en peligro de extincion? " +a1.peligroExt);

        System.out.println(a1.comer());
        System.out.println(a1.correr(2));
        System.out.println(a1.mostrarInfo());

        Animal a2= new Animal();
        a2.numPatas=8;
        a2.especie="Insecto";
        a2.color="Negro";
        a2.peligroExt= false;
        System.out.println("Número de patas: " +a2.numPatas);
        System.out.println("Es de la especie: " +a2.especie);
        System.out.println("Su color es: " +a2.color);
        System.out.println("¿Está en peligro de extincion? " +a2.peligroExt);
        System.out.println(a2.comer());
        System.out.println(a2.correr(10));
        System.out.println(a2.mostrarInfo());

        Animal a3=new Animal(100, "amarillo", "insecto", true);
        System.out.println(a3.mostrarInfo());

        Animal a4= new Animal();
        System.out.println(a4.comer("carne"));

    }

    private static void metodoPoo() {
        //Crear un objeto/instanciar la clase
        //CLASE nombreobjeto= valor
        Coche c1 = new Coche(); //import class- arriba aparece.
        // Le damos valor NEW que es el constructor de la clase coche
        c1.marca="Toyota";
        c1.color="Gris";
        c1.precio=60_000.0;
        c1.anio= 2023;
//        System.out.println("La marca del coche 1 es " +c1.marca);
//        System.out.println("El color del coche 1 es " +c1.color);
//        System.out.println("El precio del coche 1 es " +c1.precio);
//        System.out.println("El año del coche 1 es " +c1.anio);

        //Obtenemos resultados llamando a una función
//        c1.mostrarInfo();
        System.out.println(c1.mostrarInformacion());

        Coche c2= new Coche();
        c2.marca="Renault";
        c2.color="Verde";
        c2.precio=50_000.0;
        c2.anio= 2020;
//        System.out.println("La marca del coche 2 es " +c2.marca);
//        System.out.println("El color del coche 2 es " +c2.color);
//        System.out.println("El precio del coche 2 es " +c2.precio);
//        System.out.println("El año del coche 2 es " +c2.anio);
        System.out.println(c2.mostrarInformacion());

        Coche c3= new Coche("Seat", 45000);
        System.out.println(c3.mostrarInformacion());

        Coche c4=new Coche("Ibiza", 6500,"blanco", 1994);
        System.out.println(c4.mostrarInformacion());
    }

    private static void variables() {
        //Otro método
        //Añadimos tipos de variables
        //Tipos de variables enteras
        byte vByte= 7;
        //desde menos 123 hasta 123
        short vShort= 123;
        int vInt= 123_123; //Separador de miles guión bajo _
        long vLong= 123_123L;
        //Tipos variables con decimales
        float vFloat= 123.45f; //Separador de decimales punto .
        double vDouble= 123_123.898;
        char vChar='c';
        boolean vBoolean=true;

        System.out.println("Valor de variable byte " +vByte);
        System.out.println("Valor de variable short " +vShort);
        System.out.println("Valor de variable int " +vInt);
        System.out.println("Valor de variable long " +vLong);
        System.out.println("Valor de variable float " +vFloat);
        System.out.println("Valor de variable double " +vDouble);

        String vString= "Hola mundo";
        System.out.println(vString);

        Integer vInteger= 500;
        System.out.println("Tipo envolvente de int-> integer "+vInteger);
        Character vCharacter= 'c';
        System.out.println("Tipo envolvente de char-> Character " +vCharacter);
        Byte vByteE=5;
        System.out.println("Tipo envolvente de byte-> Byte " +vByteE);
    }
}
