package com.company.entity;

public abstract class Operacion {
    private CuentaOrigen cuentaOrigen;
    private CuentaDestino cuentaDestino;

    public Operacion() {
    }

    public Operacion(CuentaOrigen cuentaOrigen, CuentaDestino cuentaDestino) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    public CuentaOrigen getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaOrigen cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public CuentaDestino getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaDestino cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public abstract String mostrarDetalle();

    @Override
    public String toString() {
        return "Operacion{" +
                ", cuentaOrigen=" + cuentaOrigen +
                ", cuentaDestino=" + cuentaDestino +
                '}';
    }
}
