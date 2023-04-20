package com.company.entity;

public class CuentaOrigen extends Cuenta{
    private int idCuentaOrigen;

    public CuentaOrigen() {
    }

    public CuentaOrigen(String tipoCuenta, double saldo, Operacion operacion, int idCuentaOrigen) {
        super(tipoCuenta, saldo, operacion);
        this.idCuentaOrigen = idCuentaOrigen;
    }

    public int getIdCuentaOrigen() {
        return idCuentaOrigen;
    }

    public void setIdCuentaOrigen(int idCuentaOrigen) {
        this.idCuentaOrigen = idCuentaOrigen;
    }

    @Override
    public String verSaldo(){
        return "Saldo actual de Cuenta Origen: " + super.getSaldo();
    }

    @Override
    public String toString() {
        return "CuentaOrigen{" +
                "idCuentaOrigen=" + idCuentaOrigen +
                "} " + super.toString();
    }
}
