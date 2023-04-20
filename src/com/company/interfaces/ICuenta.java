package com.company.interfaces;

import com.company.entity.ClienteOrigen;
import com.company.entity.Cuenta;
import com.company.entity.CuentaDestino;
import com.company.entity.CuentaOrigen;

import java.util.List;

public interface ICuenta {

    public List<Cuenta> listarCuentas();
    public void guardarCuenta();
    public CuentaOrigen crearCuentaOrigen();
    public CuentaDestino crearCuentaDestino();

}
