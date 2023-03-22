package com.Adecco.modelo;

public class Animal {
    //1.Atributo
    public int numPatas;
    public String color;
    public String especie;
    public boolean peligroExt;

    //2.Métodos
    public String comer(){
        return "El animal está comiendo... ";}
    public String comer(String tipoComida){
        return "El animal está comiendo... "+tipoComida;
        }

    public String correr(double km){
        return "El animal está corriendo..."+km+" Kilómetros";
    }
    public String mostrarInfo(){
        return "número de patas es: "+numPatas+","+"el color es: "+ color+", "+", "+ "su especie es: "+especie
            +", "+"peligro de extinción "+peligroExt;
    }


    public Animal(){

    }

    public Animal(int numPatas, String color, String especie, boolean peligroExt ){
        this.numPatas= numPatas;
        this.color= color;
        this.especie= especie;
        this.peligroExt= peligroExt;
    }

}

