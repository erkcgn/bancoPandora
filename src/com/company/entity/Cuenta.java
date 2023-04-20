package com.company.entity;

public abstract class Cuenta {
    private String tipoCuenta;
    private double saldo;
    private Operacion operacion;

    public Cuenta() {
    }

    public Cuenta(String tipoCuenta, double saldo, Operacion operacion) {
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.operacion = operacion;
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

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }
    public abstract String verSaldo();

    @Override
    public String toString() {
        return "Cuenta{" +
                "tipoCuenta='" + tipoCuenta + '\'' +
                ", saldo=" + saldo +
                ", operacion=" + operacion +
                '}';
    }
}
