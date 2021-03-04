package com.ejerciciohash.ejerciciohash.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope("Prototype")
public class Usuario {
    private String nombre;
    private String passwd;

    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Usuario(String nombre, String passwd) {
        this.nombre = nombre;
        this.passwd = passwd;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "{" + " nombre='" + getNombre() + "'" + ", passwd='" + getPasswd() + "'" + ", id='" + getId() + "'"
                + "}";
    }
}