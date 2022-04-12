package com.company;

public class NaveNoTripulada extends Nave {

    private String planeta;

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String despegar() {
        return "Esta nave al desacoplarse de la nave lanzadera tendrá una potencia de despegue de: " + getPotencia_por_motor() * getMotores();
    }

    @Override
    public String aterrizar() {
        return "Para aterrizar usaremos un paracaidas y bolsas de aire." ;
    }

    @Override
    public String desacoplar() {
        return "En estos momentos nos estamos desacoplando de la nave carguera.";
    }

    @Override
    public String proposito() {
        return "Esta nave tiene la misión de explorar: " + planeta;
    }

    public String toString(){

        return " Es una Nave no tripulada y tiene una potencia de empuje total de: " + getMotores() * getPotencia_por_motor() + " Kg" +
                " pesa " + getPeso() + " Kg, usa " + getCombustible() + " y va a explorar el planeta " + planeta;
    }

}
