package com.company.test;


import com.company.entity.Cuenta;
import com.company.service.CuentaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CuentaService cuentaService = new CuentaService();
        cuentaService.realizarTransferencia();


    }
}