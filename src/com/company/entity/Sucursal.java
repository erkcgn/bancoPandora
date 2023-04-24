package com.company.entity;

public class Sucursal extends Datos{
    private int idSucursal;

    public Sucursal(){
    }
    public Sucursal(String nombre, String localidad, int idSucursal) {
        super(nombre, localidad);
        this.idSucursal = idSucursal;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public String mostrarDatos() {
        return "Información de la Sucursal: " + '\n'+
                "Nombre: " + getNombre() + '\n'+
                "Localidad: " + getLocalidad() + '\n'+
                "Código: " + getIdSucursal();
    }
}
