package com.company.interfaces;

import com.company.entity.Cliente;
import com.company.entity.ClienteDestino;
import com.company.entity.ClienteOrigen;

import java.util.List;

public interface ICliente {
    List<Cliente> listarClientes();
    public void guardarCliente();
    public ClienteOrigen crearClienteOrigen();
    public ClienteDestino crearClienteDestino();
}
