package com.company;

public class NaveTripulada extends Nave{

    private int capacidad_pasajeros;
    private String mision;

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    @Override
    public String despegar() {
        return "Esta nave al desacoplarse de la nave lanzadera tendrá una potencia de despegue de: " + getPotencia_por_motor() * getMotores();
    }

    @Override
    public String aterrizar() {
        return "Para aterrizar usaremos un sistema compuesto de propulsores y paracaidas." ;
    }

    @Override
    public String desacoplar() {
        return "En estos momentos nos estamos desacoplando de la nave carguera.";
    }

    @Override
    public String proposito() {
        return mision;
    }

    public String toString(){

        return " Es una Nave no tripulada y tiene una potencia de empuje total de: " + getMotores() * getPotencia_por_motor() + " Kg" +
                " pesa " + getPeso() + " Kg, usa " + getCombustible() + " lleva " + capacidad_pasajeros + " pasajeros y su mision es " + mision;
    }
}
