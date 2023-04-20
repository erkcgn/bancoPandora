package com.company.entity;

public class SucursalOrigen extends Sucursal{
    private int idSucursalOrigen;

    public SucursalOrigen() {    }

    public SucursalOrigen(String nombre, String localidad, int idSucursalOrigen) {
        super(nombre, localidad);
        this.idSucursalOrigen = idSucursalOrigen;
    }

    public int getIdSucursalOrigen() {
        return idSucursalOrigen;
    }
    public void setIdSucursalOrigen(int idSucursalOrigen) {
        this.idSucursalOrigen = idSucursalOrigen;
    }
    @Override
    public String mostrarDatos(){
        return "Nombre Sucursal Origen: " + super.getNombre() +'\n'+
                "Num Identificador Sucursal: " + getIdSucursalOrigen() + '\n'+
                "Localidad: " + super.getLocalidad();
    }
}
