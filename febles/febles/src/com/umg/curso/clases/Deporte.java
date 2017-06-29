package com.umg.curso.clases;

/**
 * Created by ore on 28/06/17.
 */
public class Deporte {

    private String nombre;
    private boolean conBalon;

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isConBalon() {
        return conBalon;
    }

    public void setConBalon(boolean conBalon) {
        this.conBalon = conBalon;
    }
}
