package com.company.interfaces;

import com.company.entity.Operacion;

public interface IOperacion {

    public Operacion crearOperacion();
    public void listarOperaciones();
    public void iniciarTransaccion();
}
