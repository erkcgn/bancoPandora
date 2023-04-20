package com.company.entity;

public abstract class Cliente {
    private String nombre;
    private int dni;
    private Sucursal sucursal;
    private Cuenta cuenta;

    public Cliente() {
    }

    public Cliente(String nombre, int dni, Sucursal sucursal, Cuenta cuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.sucursal = sucursal;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public abstract String mostrarDatos();

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", sucursal=" + sucursal +
                ", cuenta=" + cuenta +
                '}';
    }
}
