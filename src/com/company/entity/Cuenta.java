package com.company.entity;

public abstract class Cuenta {
    private String tipoCuenta;
    private double saldo;

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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
