package com.company.service;

import com.company.entity.Cliente;
import com.company.entity.ClienteDestino;
import com.company.entity.ClienteOrigen;
import com.company.interfaces.ICliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteService implements ICliente {
    ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    @Override
    public List<Cliente> listarClientes() {
        clientes.add(crearClienteOrigen());
        clientes.add(crearClienteDestino());
        System.out.println("** Clientes involucrados **");
        for(Cliente lista : clientes){
            System.out.println(lista.mostrarDatos());
            System.out.println("-------------------------");
        }

        return clientes;
    }

    @Override
    public void guardarCliente() {
        System.out.println("Revisar");
    }

    @Override
    public ClienteOrigen crearClienteOrigen(){
        ClienteOrigen clienteOrigen = new ClienteOrigen();
        System.out.println("** Ingrese los datos de quien realiza la operación: **");
        System.out.println("Nombre: ");
        clienteOrigen.setNombre(input.next());
        System.out.println("DNI: ");
        clienteOrigen.setDni(input.nextInt());
        //clienteOrigen.getSucursal();
        //clienteOrigen.getCuentaOrigen(); // CREAR UN SERVICIO QUE LOS JUNTE?

        return clienteOrigen;
    }

    @Override
    public ClienteDestino crearClienteDestino() {
        ClienteDestino clienteDestino = new ClienteDestino();
        System.out.println("** Ingrese los datos del Destinatario: **");
        System.out.println("Nombre: ");
        clienteDestino.setNombre(input.next());
        System.out.println("DNI: ");
        clienteDestino.setDni(input.nextInt());
        //clienteOrigen.getSucursal();
        //clienteOrigen.getCuentaOrigen(); // CREAR UN SERVICIO QUE LOS JUNTE?

        return clienteDestino;
    }


}
