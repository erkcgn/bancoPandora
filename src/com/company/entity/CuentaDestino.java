package com.company.entity;

public class CuentaDestino extends Cuenta{
    private int idCuentaDestino;
    private String alias;

    public CuentaDestino() {
    }

    public CuentaDestino(String tipoCuenta, double saldo, Operacion operacion, int idCuentaDestino, String alias) {
        super(tipoCuenta, saldo, operacion);
        this.idCuentaDestino = idCuentaDestino;
        this.alias = alias;
    }

    public int getIdCuentaDestino() {
        return idCuentaDestino;
    }

    public void setIdCuentaDestino(int idCuentaOrigen) {
        this.idCuentaDestino = idCuentaOrigen;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String verSaldo(){
        return "Saldo actual de Cuenta Destinatario: " + super.getSaldo();
    }

    @Override
    public String toString() {
        return "CuentaDestino{" +
                "idCuentaDestino=" + idCuentaDestino +
                ", alias='" + alias + '\'' +
                "} " + super.toString();
    }
}
