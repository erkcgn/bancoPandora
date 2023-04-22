package com.company.entity;

public class Cuenta {
    private Persona titular;
    private double saldo = 1000;

    public Cuenta() {
    }

    public Cuenta(Persona titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String mostrarDetalle() {
        return "Información de la Cuenta: " + '\n'+
                "Saldo Actual: $ " + getSaldo() + '\n'+
                  getTitular().mostrarDatos();
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

    @Override
    public String toString() {
        return "Cuenta: " +
                "titular=" + titular +
                ", saldo=" + saldo ;
    }
}
