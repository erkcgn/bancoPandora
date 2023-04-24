package com.company.service;

import com.company.entity.Cuenta;
import com.company.interfaces.ICuenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuentaService implements ICuenta {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    List<Cuenta> cuentas = new ArrayList<>();
    PersonaService personaService = new PersonaService();
    SucursalService sucursalService = new SucursalService();

    @Override
    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setTitular(personaService.crearPersona());
        cuenta.setSucursal(sucursalService.crearSucursal());
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        if (cuenta != null) {
            cuentas.add(cuenta);
        }

        return cuenta;
    }

    @Override
    public void listarCuentas() {
        for (Cuenta lista : cuentas){
            System.out.println(lista.mostrarDetalle());
        }
    }
    @Override
    public boolean ingresarDinero(Cuenta cuenta, double cantidad) {

        boolean ingresoCorrecto = true;

        if(cantidad < 0){
            ingresoCorrecto = false;
        } else {
            double ingresaCantidad = cuenta.getSaldo() + cantidad;
            cuenta.setSaldo(ingresaCantidad);
        }

        return ingresoCorrecto;
    }

    @Override
    public boolean egresarDinero(Cuenta cuenta, double cantidad) {

        boolean egresoCorrecto = true;
        if(cantidad < 0){
            egresoCorrecto = false;
        } else if (cuenta.getSaldo() >= 0){
            System.out.println("Operación confirmada!");
            double descontarCantidad = cuenta.getSaldo() - cantidad;
            cuenta.setSaldo(descontarCantidad);
        }else {
            egresoCorrecto = false;
        }
        return egresoCorrecto;
    }

    @Override
    public boolean transferencia(Cuenta emisor, Cuenta receptor, double cantidad) {
        boolean correcto = true;
        if (cantidad < 0 && cantidad > emisor.getSaldo()){
            correcto = false;
        }else if (cantidad <= emisor.getSaldo()){
                egresarDinero(emisor, cantidad);
                ingresarDinero(receptor, cantidad);
        } else {
            correcto = false;
            System.out.println("Saldo insuficiente!");
        }
        return correcto;
    }

    @Override
    public void mostrarDetalle(Cuenta emisor, Cuenta receptor){
        System.out.println("---------------------------");
        System.out.println("***     Comprobante     ***");
        System.out.println("    Realizo la operación   ");
        System.out.println(emisor.mostrarDetalle());
        System.out.println("                           ");
        System.out.println("        Destinatario       ");
        System.out.println(receptor.mostrarDetalle());
        System.out.println("---------------------------");

    }

    @Override
    public void realizarTransferencia() {
        CuentaService cuentaService = new CuentaService();

        System.out.println("Datos de quien realiza la Operación: ");
        Cuenta cuentaEmisor = cuentaService.crearCuenta();
        System.out.println("                                     ");
        System.out.println("Datos del Destinatario: ");
        Cuenta cuentaReceptor = cuentaService.crearCuenta();
        System.out.println("                                     ");
        System.out.println("Ingrese monto a transferir: ");
        double cantidad = input.nextDouble();

        while(cuentaService.transferencia(cuentaEmisor, cuentaReceptor, cantidad)){
            cuentaService.mostrarDetalle(cuentaEmisor, cuentaReceptor);
            break;
        }

    }


}
