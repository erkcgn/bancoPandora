package com.company.entity;

public class Transferencia{
    private int idTransferencia;
    private double monto;
    private CuentaOrigen cuentaOrigen;
    private CuentaDestino cuentaDestino;


    public Transferencia(int idTransferencia, double monto, CuentaOrigen cuentaOrigen, CuentaDestino cuentaDestino) {
        this.idTransferencia = idTransferencia;
        this.monto = monto;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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

    @Override
    public String toString() {
        return "Transferencia{" +
                "idTransferencia=" + idTransferencia +
                ", monto=" + monto +
                ", cuentaOrigen=" + cuentaOrigen +
                ", cuentaDestino=" + cuentaDestino +
                '}';
    }
}
