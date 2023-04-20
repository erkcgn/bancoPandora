package com.company.service;

import com.company.entity.Sucursal;
import com.company.entity.SucursalDestino;
import com.company.entity.SucursalOrigen;
import com.company.interfaces.ISucursal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SucursalService implements ISucursal {

    ArrayList<Sucursal> sucursales = new ArrayList<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    @Override
    public SucursalOrigen crearSucursalOrigen(){
        SucursalOrigen sucursalOrigen = new SucursalOrigen();
        System.out.println("** Ingrese datos de Sucursal Origen de la operación: **");
        System.out.println("Nombre de la Sucursal: ");
        sucursalOrigen.setNombre(input.next());
        System.out.println("Número identificador: ");
        sucursalOrigen.setIdSucursalOrigen(input.nextInt());
        System.out.println("Localidad: ");
        sucursalOrigen.setLocalidad(input.next());

        return sucursalOrigen;
    }
    @Override
    public SucursalDestino crearSucursalDestino(){
        SucursalDestino sucursalDestino = new SucursalDestino();
        System.out.println("** Ingrese datos de Sucursal Destinatario: **");
        System.out.println("Nombre de la Sucursal: ");
        sucursalDestino.setNombre(input.next());
        System.out.println("Número identificador: ");
        sucursalDestino.setIdSucursalDestino(input.nextInt());
        System.out.println("Localidad: ");
        sucursalDestino.setLocalidad(input.next());

        return sucursalDestino;
    }

    @Override
    public List<Sucursal> listaSucursales(){
        sucursales.add(crearSucursalOrigen());
        sucursales.add(crearSucursalDestino());
        System.out.println("** Sucursales involucradas: **");
        for(Sucursal lista : sucursales){
            System.out.println(lista.mostrarDatos());
            System.out.println("-------------------------");
        }

        return sucursales;
    }

    @Override
    public void guardarSucursales(){
        System.out.println("Revisar");
    }

}
