package com.example.concesionario.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "coche")
public class Coche {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private String matricula;

    private String marca;
    private String modelo;
    private double potencia;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", matricula='" + getMatricula() + "'" + ", marca='" + getMarca() + "'"
                + ", modelo='" + getModelo() + "'" + ", potencia='" + getPotencia() + "'" + "}";
    }

    public Coche(int id, String matricula, String marca, String modelo, double potencia) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Coche() {
    }

}
