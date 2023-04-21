package com.company.entity;

public class Sucursal extends Datos{
    private Cuenta cuenta;

    public Sucursal(){
    }
    public Sucursal(String nombre, String localidad, Cuenta cuenta) {
        super(nombre, localidad);
        this.cuenta = cuenta;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    @Override
    public String mostrarDatos() {
        return null;
    }
}
