package com.company.test;


import com.company.entity.Cuenta;
import com.company.service.CuentaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        CuentaService cuentaService = new CuentaService();

        System.out.println("Datos de quien realiza la Operación: ");
        Cuenta cuentaEmisor = cuentaService.crearCuenta();
        System.out.println("Datos del Destinatario: ");
        Cuenta cuentaReceptor = cuentaService.crearCuenta();
        System.out.println("Ingrese monto a transferir: ");
        double cantidad = input.nextDouble();

        cuentaService.transferencia(cuentaEmisor, cuentaReceptor, cantidad);

        cuentaService.mostrarDetalle(cuentaEmisor, cuentaReceptor);
    }
}