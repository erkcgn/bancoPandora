package com.company.service;

import com.company.entity.Cuenta;
import com.company.interfaces.ICuenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuentaService implements ICuenta {
    List<Cuenta> cuentas = new ArrayList<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    PersonaService personaService = new PersonaService();
    SucursalService sucursalService = new SucursalService();

    @Override
    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setTitular(personaService.crearPersona());
        System.out.println("Saldo actual: ");
        System.out.println(cuenta.getSaldo());

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
        }

        return ingresoCorrecto;
    }

    @Override
    public boolean egresarDinero(Cuenta cuenta, double cantidad) {

        boolean egresoCorrecto = true;
        if(cantidad < 0){
            egresoCorrecto = false;
        } else if (cuenta.getSaldo() >= 0){
            double descontarCantidad = cuenta.getSaldo() - cantidad;
            System.out.println("Transferir: $" + descontarCantidad + ", es viable!");
        }else {
            egresoCorrecto = false;
        }
        return egresoCorrecto;
    }
    @Override
    public boolean transferencia(Cuenta emisor, Cuenta receptor, double cantidad) {
        boolean correcto = true;
        if (cantidad < 0){
            correcto = false;
            System.out.println("Saldo insuficiente");
        }else if (emisor.getSaldo() >= cantidad){
                egresarDinero(emisor, cantidad);
                ingresarDinero(receptor, cantidad);
        } else {
            correcto = false;
        }
        return correcto;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("REVISAR");

    }

}
