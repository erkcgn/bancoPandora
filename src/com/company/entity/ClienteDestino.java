package com.company.entity;

public class ClienteDestino extends Cliente{
    private int idClienteDestino;
    private CuentaDestino cuentaDestino;
    private String alias;

    public ClienteDestino() {
    }

    public ClienteDestino(String nombre, int dni, Sucursal sucursal, Cuenta cuenta, int idClienteDestino, CuentaDestino cuentaDestino, String alias) {
        super(nombre, dni, sucursal, cuenta);
        this.idClienteDestino = idClienteDestino;
        this.cuentaDestino = cuentaDestino;
        this.alias = alias;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String mostrarDatos(){
        return "Nombre del Cliente Destinatario: " + super.getNombre() + '\n'+
                "DNI: " + super.getDni() + '\n'+
                "Sucursal: " + super.getSucursal() + '\n'+
                "Cuenta: " + getCuentaDestino() + '\n' +
                "Alias: " + getAlias() + '\n';
    }
}
