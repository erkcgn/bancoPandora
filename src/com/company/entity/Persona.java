package com.company.entity;

public class Persona extends Datos{
    private String dni;

    public  Persona() {
    }
    public Persona(String nombre, String localidad, String dni) {
        super(nombre, localidad);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String mostrarDatos(){
        return  "Nombre: " + getNombre() + '\n'+
                "Localidad: " + getLocalidad() + '\n'+
                "DNI: " + getDni();
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "DNI: " + dni + '\n' + super.toString();
    }
}
