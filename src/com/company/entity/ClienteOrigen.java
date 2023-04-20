package com.company.entity;

public class ClienteOrigen extends Cliente{
    private int idClienteOrigen;
    private CuentaOrigen cuentaOrigen;
    private String alias;

    public ClienteOrigen() {
    }

    public ClienteOrigen(String nombre, int dni, Sucursal sucursal, Cuenta cuenta, int idClienteOrigen, CuentaOrigen cuentaOrigen, String alias) {
        super(nombre, dni, sucursal, cuenta);
        this.idClienteOrigen = idClienteOrigen;
        this.cuentaOrigen = cuentaOrigen;
        this.alias = alias;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String mostrarDatos(){
        return "Nombre del Cliente Origen: " + super.getNombre() +
                ", DNI: " + super.getDni() + '\''+
                ", Sucursal: " + super.getSucursal() + '\''+
                ", Cuenta: " + getCuentaOrigen() + '\'' +
                ", Alias: " + getAlias() + '\'';
    }
}
