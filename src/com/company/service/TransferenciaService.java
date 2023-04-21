package com.company.service;

import com.company.entity.CuentaDestino;
import com.company.entity.CuentaOrigen;
import com.company.entity.Transferencia;
import com.company.interfaces.ITransferencia;

import java.util.ArrayList;
import java.util.Scanner;

public class TransferenciaService implements ITransferencia {

    ArrayList<Transferencia> transferencias = new ArrayList<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    @Override
    public Transferencia crearTransferencia() {
        SucursalService sucursalService = new SucursalService();
        ClienteService clienteService = new ClienteService();
        CuentaService cuentaService = new CuentaService();

        Transferencia transferencia = new Transferencia();

        System.out.println("** Completar Datos para iniciar la Operación: **");
        sucursalService.crearSucursalOrigen();
        clienteService.crearClienteOrigen();
        cuentaService.crearCuentaOrigen();
        System.out.println("Ingrese monto a transferir: ");
        transferencia.setMonto(input.nextDouble());
        sucursalService.crearSucursalDestino();
        clienteService.crearClienteDestino();
        cuentaService.crearCuentaDestino();

        return transferencia;
    }


    @Override
    public void realizarTransferencia(CuentaOrigen cuentaOrigen, CuentaDestino cuentaDestino, double monto) {

        if (cuentaOrigen.getSaldo() >= monto){
            //cuentaDestino.getSaldo() += monto;
            System.out.println("transferencia realizada!");
        } else {
            System.out.println("Saldo insuficiente...");
        }

    }

    @Override
    public ArrayList<Transferencia> listarTransferencia() {

        transferencias.add(crearTransferencia());
        System.out.println("** Detalle de la Operación: **");

        return transferencias;
    }
}
