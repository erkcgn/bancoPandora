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
        System.out.println("** Ingrese los datos de su Sucursal: **");
        System.out.println("Nombre de la Sucursal: ");
        sucursalOrigen.setNombre(input.next());
        System.out.println("Número sucursal: ");
        sucursalOrigen.setIdSucursalOrigen(input.nextInt());
        System.out.println("Localidad: ");
        sucursalOrigen.setLocalidad(input.next());

        return sucursalOrigen;
    }
    @Override
    public SucursalDestino crearSucursalDestino(){
        SucursalDestino sucursalDestino = new SucursalDestino();
        System.out.println("** Datos de Sucursal Destinatario: **");
        System.out.println("Nombre de la Sucursal: ");
        sucursalDestino.setNombre(input.next());
        System.out.println("Número sucursal: ");
        sucursalDestino.setIdSucursalDestino(input.nextInt());
        System.out.println("Localidad: ");
        sucursalDestino.setLocalidad(input.next());

        return sucursalDestino;
    }

    @Override
    public List<Sucursal> listarSucursales(){
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
    public void guardarSucursal(){
        System.out.println("Revisar");
    }

}
