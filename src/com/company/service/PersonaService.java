package com.company.service;

import com.company.entity.Persona;
import com.company.interfaces.IPersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaService implements IPersona {

    List<Persona> personas = new ArrayList<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    @Override
    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("** DATOS CLIENTE **");
        System.out.println("Nombre: ");
        persona.setNombre(input.next());
        System.out.println("Localidad: ");
        persona.setLocalidad(input.next());
        System.out.println("DNI: ");
        persona.setDni(input.next());

        if (persona != null) {
            personas.add(persona);
        }

        return persona;
    }

    @Override
    public void listarPersonas() {
        for(Persona lista : personas){
            System.out.println(lista.mostrarDatos());
        }
    }
}
