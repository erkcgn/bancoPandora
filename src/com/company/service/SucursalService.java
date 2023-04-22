package com.company.service;

import com.company.entity.Sucursal;
import com.company.interfaces.ISucursal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SucursalService implements ISucursal {

    List<Sucursal> sucursales = new ArrayList<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    @Override
    public Sucursal crearSucursal() {
        Sucursal sucursal = new Sucursal();
        System.out.println("** DATOS SUCURSAL **");
        System.out.println("Nombre: ");
        sucursal.setNombre(input.next());
        System.out.println("Localidad: ");
        sucursal.setLocalidad(input.next());
        System.out.println("Código: ");
        sucursal.setIdSucursal(input.nextInt());


        return sucursal;
    }

    @Override
    public void listarSucursales() {
        sucursales.add(crearSucursal());

        for (Sucursal lista : sucursales) {
            System.out.println(lista.mostrarDatos());
        }

    }
}
