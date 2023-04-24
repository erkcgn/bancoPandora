package com.company.entity;

public class Cuenta {
    private Persona titular;
    private Sucursal sucursal;
    private double saldo = 1000;

    public Cuenta() {
    }

    public Cuenta(Persona titular, Sucursal sucursal,double saldo) {
        this.titular = titular;
        this.sucursal = sucursal;
        this.saldo = saldo;
    }

    public String mostrarDetalle() {
        return "Información de la Cuenta: " + '\n'+
                 getTitular().mostrarDatos() + '\n'+
                  "Saldo Actual: $ " + getSaldo() + '\n'+
                    getSucursal().mostrarDatos();
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

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular=" + titular +
                ", sucursal=" + sucursal +
                ", saldo=" + saldo +
                '}';
    }
}
