package com.company.entity;

public abstract class Cuenta {
    private String tipoCuenta;
    private double saldo = 1000.00;

    public Cuenta() {
    }

    public Cuenta(String tipoCuenta, double saldo) {
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract String verSaldo();

    @Override
    public String toString() {
        return "Cuenta{" +
                "tipoCuenta='" + tipoCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
