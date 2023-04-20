package com.company.entity;

public class Transferencia extends Operacion{
    private int idTransferencia;
    private double monto;

    public Transferencia(CuentaOrigen cuentaOrigen, CuentaDestino cuentaDestino, int idTransferencia, double monto) {
        super(cuentaOrigen, cuentaDestino);
        this.idTransferencia = idTransferencia;
        this.monto = monto;
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

    @Override
    public String mostrarDetalle() {
        return "Detalle de la Transferencia Realizada: " +
                ", Número de la transferencia: " + getIdTransferencia() + '\'' +
                ", Cuenta que realiza la operación: " + super.getCuentaOrigen() + '\'' +
                ", Cuenta del destinatario: " + super.getCuentaDestino() + '\'' +
                ", Monto de la operación: " + getMonto() + '\'';
    }
}
