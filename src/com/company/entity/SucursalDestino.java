package com.company.entity;

public class SucursalDestino extends Sucursal{
    private int idSucursalDestino;

    public SucursalDestino(){
    }

    public SucursalDestino(String nombre, String localidad, int idSucursalDestino) {
        super(nombre, localidad);
        this.idSucursalDestino = idSucursalDestino;
    }

    public int getIdSucursalDestino() {
        return idSucursalDestino;
    }

    public void setIdSucursalDestino(int idSucursalDestino) {
        this.idSucursalDestino = idSucursalDestino;
    }
    @Override
    public String mostrarDatos(){
        return "Nombre Sucursal del Destinatario: " + super.getNombre() + '\n'+
                "Num Identificador Sucursal: " + getIdSucursalDestino() + '\n'+
                "Localidad: " + super.getLocalidad();
    }
}
