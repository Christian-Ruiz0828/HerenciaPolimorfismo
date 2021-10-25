package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamiferos{
    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre){
        super(nombre);
    }
    public Perro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    public void jugar(){
        System.out.println("Estoy jugando");
    }
    public void ladrar(){
        System.out.println("Guauf");
    }

    public void comer(String alimento) {
        System.out.println("Estoy comiendo ");
    }

    @Override
    public void respirar() {
        System.out.println("Respirando por la nariz");
    }

    @Override
    public void gestacion (){
        System.out.println("tiempo de gestacion 2 meses");
    }

    @Override
    public void ingestarLeche(){
        System.out.println("estoy ingiriendo leche");
    }

    @Override
    public void movilidad(){
        System.out.println("camino en 4 patas");
    }

    @Override
    public void dormir(){
        System.out.println("ZZZzzzzzZZzz");
    }

    @Override
    public void hablar(){
        System.out.println("guafff");
    }

}