package com.company.interfaces;

import com.company.entity.CuentaDestino;
import com.company.entity.CuentaOrigen;
import com.company.entity.Transferencia;

import java.util.List;

public interface ITransferencia {

    public Transferencia crearTransferencia();
    List<String> listarTransferencia();

    public void realizarTransferencia(CuentaOrigen cuentaOrigen, CuentaDestino cuentaDestino, double monto);
}
