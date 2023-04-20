package com.company.entity;

public class CuentaOrigen extends Cuenta{
    private int idCuentaOrigen;
    private String alias;

    public CuentaOrigen() {
    }

    public CuentaOrigen(String tipoCuenta, double saldo, int idCuentaOrigen, String alias) {
        super(tipoCuenta, saldo);
        this.idCuentaOrigen = idCuentaOrigen;
        this.alias = alias;
    }

    public int getIdCuentaOrigen() {
        return idCuentaOrigen;
    }

    public void setIdCuentaOrigen(int idCuentaOrigen) {
        this.idCuentaOrigen = idCuentaOrigen;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String verSaldo(){
        return "Saldo actual de Cuenta Origen: " + super.getSaldo();
    }

    @Override
    public String toString() {
        return "CuentaOrigen{" +
                "idCuentaOrigen=" + idCuentaOrigen +
                ", alias='" + alias + '\'' +
                "} " + super.toString();
    }
}
