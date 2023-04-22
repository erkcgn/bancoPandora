package com.company.service;

import com.company.entity.Operacion;
import com.company.entity.Persona;
import com.company.interfaces.IOperacion;
import com.company.interfaces.ISucursal;

import java.util.Scanner;

public class OperacionService implements IOperacion{

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    @Override
    public Operacion crearOperacion() {
        Operacion operacion1 = new Operacion();
        operacion1.setIdOperacion(input.nextInt());
        operacion1.setTitular(new Persona());

        return operacion1;
    }

    @Override
    public void listarOperaciones() {

    }

    @Override
    public void iniciarTransaccion() {

    }


}
