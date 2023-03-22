package com.Adecco.modelo;

public class Coche {
    public String marca; //Atributos MODO DE ACCESO(public), TIPO(String) Y NOMBRE(coche)
    public double precio;
    public int anio;
    public String color;
//    public void mostrarInfo(){
//        System.out.println("Marca: "+marca);
//        System.out.println("Precio: "+precio);
//        System.out.println("Color: "+color);
//    }

    public String mostrarInformacion(){
        return " Marca: "+marca + " Precio: "+precio+ " Color: "+color+ " Año: "+anio;

    }
    public Coche(){
    }
    public Coche(String pMarca, double precio){
        marca= pMarca;
        this.precio=precio;
    }

    public Coche(String marca, double precio, String color, int anio){
        this.marca=marca;
        this.precio=precio;
        this.color=color;
        this.anio=anio;
    }
}
