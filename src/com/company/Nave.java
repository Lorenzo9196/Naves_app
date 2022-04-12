package com.company;

public abstract class Nave implements INave{

    private String nombre;
    private int motores;
    private double potencia_por_motor;
    private String combustible;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public double getPotencia_por_motor() {
        return potencia_por_motor;
    }

    public void setPotencia_por_motor(double potencia_por_motor) {
        this.potencia_por_motor = potencia_por_motor;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
