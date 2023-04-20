package com.company.test;

import com.company.service.ClienteService;
import com.company.service.SucursalService;

public class Main {
    public static void main(String[] args) {

        SucursalService sucursalService = new SucursalService();
        sucursalService.listaSucursales();
        sucursalService.guardarSucursales();

        ClienteService clienteService = new ClienteService();
        clienteService.listaClientes();

    }
}