package com.company.test;

import com.company.service.ClienteService;
import com.company.service.CuentaService;
import com.company.service.SucursalService;

public class Main {
    public static void main(String[] args) {

        SucursalService sucursalService = new SucursalService();
        sucursalService.listarSucursales();

        ClienteService clienteService = new ClienteService();
        clienteService.listarClientes();

        CuentaService cuentaService = new CuentaService();
        cuentaService.listarCuentas();



    }
}