package com.company.entity;

public abstract class Sucursal {
    private String nombre;
    private String localidad;

    public Sucursal() {
    }
    public Sucursal(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }
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

    public abstract String mostrarDatos();

    @Override
    public String toString() {
        return "Sucursal{" +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
