package com.company.entity;

public class ClienteDestino extends Cliente{
    private int idClienteDestino;
    private CuentaDestino cuentaDestino;

    public ClienteDestino() {
    }

    public ClienteDestino(String nombre, int dni, Sucursal sucursal, Cuenta cuenta, int idClienteDestino, CuentaDestino cuentaDestino) {
        super(nombre, dni, sucursal, cuenta);
        this.idClienteDestino = idClienteDestino;
        this.cuentaDestino = cuentaDestino;
    }

    public int getIdClienteDestino() {
        return idClienteDestino;
    }

    public void setIdClienteDestino(int idClienteDestino) {
        this.idClienteDestino = idClienteDestino;
    }

    public CuentaDestino getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaDestino cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
    @Override
    public String mostrarDatos(){
        return "Nombre del Cliente Destinatario: " + super.getNombre() + '\n'+
                "DNI: " + super.getDni() + '\n'+
                "Sucursal: " + super.getSucursal() + '\n'+
                "Cuenta: " + getCuentaDestino();
    }
}
