package com.company.entity;

public class ClienteOrigen extends Cliente{
    private int idClienteOrigen;
    private CuentaOrigen cuentaOrigen;

    public ClienteOrigen() {
    }

    public ClienteOrigen(String nombre, int dni, Sucursal sucursal, Cuenta cuenta, int idClienteOrigen, CuentaOrigen cuentaOrigen) {
        super(nombre, dni, sucursal, cuenta);
        this.idClienteOrigen = idClienteOrigen;
        this.cuentaOrigen = cuentaOrigen;
    }

    public int getIdClienteOrigen() {
        return idClienteOrigen;
    }

    public void setIdClienteOrigen(int idClienteOrigen) {
        this.idClienteOrigen = idClienteOrigen;
    }

    public CuentaOrigen getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaOrigen cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    @Override
    public String mostrarDatos(){
        return "Nombre del Cliente Origen: " + super.getNombre() + '\n'+
                "DNI: " + super.getDni() + '\n'+
                "Sucursal: " + super.getSucursal() + '\n'+
                "Cuenta: " + getCuentaOrigen();
    }
}
