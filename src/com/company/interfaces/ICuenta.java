package com.company.interfaces;


import com.company.entity.Cuenta;
import com.company.entity.Persona;
import com.company.entity.Sucursal;

import java.util.List;

public interface ICuenta {

    public void listarCuentas();
    public Cuenta crearCuenta();
    public boolean transferencia(Cuenta emisor, Cuenta receptor, double cantidad);
    public boolean ingresarDinero(Cuenta cuenta, double cantidad);
    public boolean egresarDinero(Cuenta cuenta, double cantidad);
    public void mostrarDetalle(Cuenta emisor, Cuenta receptor);

    public void realizarTransferencia();
}
