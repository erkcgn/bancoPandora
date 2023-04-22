package com.company.entity;

public class Operacion extends Cuenta{
    private int idOperacion;

    public Operacion() {

    }

    @Override
    public void mostrarDetalle() {
        System.out.println("revisar metodo");
    }

    public Operacion(Persona titular, double saldo, int idOperacion) {
        super(titular, saldo);
        this.idOperacion = idOperacion;
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }



}
