package com.itb.wave8.demo.entities;

public class Prenda {

    private String marca;
    private String modelo;

    public Prenda() {
        this.marca = "";
        this.modelo = "";
    }

    public Prenda(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "La marca de la prenda es: " + this.marca
                + " y el modelo es: " + this.modelo;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof  Prenda)){
            return false;
        }
        Prenda temp = (Prenda)obj;
        return this.modelo.equals(temp.getModelo()) && this.marca.equals(temp.getMarca());
    }
}
