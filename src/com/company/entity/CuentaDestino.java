package com.company.entity;

public class CuentaDestino extends Cuenta{
    private int idCuentaDestino;

    public CuentaDestino() {
    }

    public CuentaDestino(String tipoCuenta, double saldo, Operacion operacion, int idCuentaDestino) {
        super(tipoCuenta, saldo, operacion);
        this.idCuentaDestino = idCuentaDestino;
    }

    public int getIdCuentaDestino() {
        return idCuentaDestino;
    }

    public void setIdCuentaDestino(int idCuentaOrigen) {
        this.idCuentaDestino = idCuentaOrigen;
    }

    @Override
    public String verSaldo(){
        return "Saldo actual de Cuenta Destinatario: " + super.getSaldo();
    }

    @Override
    public String toString() {
        return "CuentaDestino{" +
                "idCuentaDestino=" + idCuentaDestino +
                "} " + super.toString();
    }
}
