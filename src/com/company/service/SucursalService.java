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
        System.out.println("Ingrese el nombre de la Sucursal Origen: ");
        sucursalOrigen.setNombre(input.next());
        System.out.println("Ingrese el número identificador: ");
        sucursalOrigen.setIdSucursalOrigen(input.nextInt());
        System.out.println("Ingrese la localidad: ");
        sucursalOrigen.setLocalidad(input.next());

        return sucursalOrigen;
    }
    @Override
    public SucursalDestino crearSucursalDestino(){
        SucursalDestino sucursalDestino = new SucursalDestino();
        System.out.println("Ingrese el nombre de la Sucursal Destino: ");
        sucursalDestino.setNombre(input.next());
        System.out.println("Ingrese el número identificador: ");
        sucursalDestino.setIdSucursalDestino(input.nextInt());
        System.out.println("Ingrese la localidad: ");
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
    public void guardarSucursales(Sucursal sucursal){
        System.out.println("lista" + sucursal);
    }

}
