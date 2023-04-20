package com.company.interfaces;

import com.company.entity.Sucursal;
import com.company.entity.SucursalDestino;
import com.company.entity.SucursalOrigen;

import java.util.ArrayList;
import java.util.List;

public interface ISucursal {

    public List<Sucursal> listaSucursales();
    public void guardarSucursales();
    public SucursalOrigen crearSucursalOrigen();
    public SucursalDestino crearSucursalDestino();

}
