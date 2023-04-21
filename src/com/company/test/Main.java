package com.company.test;

import com.company.entity.CuentaOrigen;
import com.company.entity.Transferencia;
import com.company.service.ClienteService;
import com.company.service.CuentaService;
import com.company.service.SucursalService;
import com.company.service.TransferenciaService;

public class Main {
    public static void main(String[] args) {
        /*
        SucursalService sucursalService = new SucursalService();
        sucursalService.listarSucursales();

        ClienteService clienteService = new ClienteService();
        clienteService.listarClientes();

        CuentaService cuentaService = new CuentaService();
        cuentaService.listarCuentas();

         */

        TransferenciaService transferenciaService = new TransferenciaService();
        transferenciaService.listarTransferencia();


    }
}