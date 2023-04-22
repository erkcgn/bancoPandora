package com.company.entity;

public abstract class Datos {
    private String nombre;
    private String localidad;

    public Datos() {
    }

    public Datos(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public abstract String mostrarDatos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }


}
