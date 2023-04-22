package com.company.entity;

public abstract class Cuenta {
    private Persona titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(Persona titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void mostrarDetalle();

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
