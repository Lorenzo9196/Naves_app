package com.company;

public class NaveLanzadera extends Nave{

    private double capacidad_carga;

/*    public NaveLanzadera (String nombre, int motores, double potencia_por_motor, String combustible, double peso, String destino, String capacidad_carga){
        super(nombre, motores, potencia_por_motor, combustible, peso, destino);
    }*/

    public double getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(double capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    @Override
    public String despegar() {
        return "la nave despegará con una potencia de: " + getPotencia_por_motor() * getMotores();
    }

    @Override
    public String aterrizar() {
        return "tenga en cuenta que la nave pesa: " + getPeso() + " Kg";
    }

    @Override
    public String desacoplar() {
        return "En estos momentos estamos soltando la carga. ";
    }

    @Override
    public String proposito(){
        return "Esta nave cargará con máximo: " + capacidad_carga + " Kg";
    }

    public String toString(){

        return " Es una Nave Lanzadera y tiene una potencia de empuje total de: " + getMotores() * getPotencia_por_motor() + " Kg" +
                " pesa " + getPeso() + " Kg, usa " + getCombustible() + " y puede cargar hasta " + capacidad_carga;
    }

}
