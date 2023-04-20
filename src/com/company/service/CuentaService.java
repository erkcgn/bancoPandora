package com.company.service;

import com.company.entity.Cuenta;
import com.company.entity.CuentaDestino;
import com.company.entity.CuentaOrigen;
import com.company.interfaces.ICuenta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuentaService implements ICuenta {

    ArrayList<Cuenta> cuentas = new ArrayList<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    @Override
    public List<Cuenta> listarCuentas() {
        cuentas.add(crearCuentaOrigen());
        cuentas.add(crearCuentaDestino());
        System.out.println("** Cuentas involucradas : **");
        for(Cuenta lista : cuentas){
            System.out.println(lista.toString());
        }

        return null;
    }

    @Override
    public void guardarCuenta() {
        System.out.println("REVISAR");
    }

    @Override
    public CuentaOrigen crearCuentaOrigen() {
        CuentaOrigen cuentaOrigen = new CuentaOrigen();
        System.out.println("** Ingrese datos de la Cuenta Origen para la operación: **");
        System.out.println("Tipo de Cuenta: ");
        cuentaOrigen.setTipoCuenta(input.next());
        System.out.println("Saldo Actual");
        cuentaOrigen.setSaldo(input.nextInt());
        System.out.println("Numero Identificador");
        cuentaOrigen.setIdCuentaOrigen(input.nextInt());
        System.out.println("Alias: ");
        cuentaOrigen.setAlias(input.next());
        //OPERACION?

        return cuentaOrigen;
    }

    @Override
    public CuentaDestino crearCuentaDestino() {
        CuentaDestino cuentaDestino = new CuentaDestino();
        System.out.println("** Ingrese datos del Destinatario para la operación: **");
        System.out.println("Tipo de Cuenta: ");
        cuentaDestino.setTipoCuenta(input.next());
        System.out.println("Saldo Actual");
        cuentaDestino.setSaldo(input.nextInt());
        System.out.println("Numero Identificador");
        cuentaDestino.setIdCuentaDestino(input.nextInt());
        System.out.println("Alias: ");
        cuentaDestino.setAlias(input.next());
        //OPERACION?

        return null;
    }
}
