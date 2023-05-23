package com.example.demo.infraestructura.adaptadores.repositorios;

import com.example.demo.domain.model.entities.Clientes;
import com.example.demo.domain.model.gateway.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class ClienteAdapterRepositorio implements ListarClienteGateway, InsertarClienteGateway, ActualizarClienteGateway, BuscarClienteByIdGateway, BuscarClientesBySharedKeyGateway,BusquedaAvanzadaGateway {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Override
    public List<Clientes> listarClientes() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Clientes insertarCliente(Clientes clientes) {

        String inicialPrimeraLetra=clientes.getBusiness_id().substring(0,1);
        String[] primerApellido=clientes.getBusiness_id().split(" ");
        String unionSharedKey=inicialPrimeraLetra+""+primerApellido[1];

        clientes.setShared_key(unionSharedKey);
        clientes.setDate_add(new Date());
        clienteRepositorio.save(clientes);
        return clientes;
    }

    @Override
    public Clientes actualizarClientes(Clientes clientes) {
        return clienteRepositorio.save(clientes);
    }

    @Override
    public Clientes buscarById(String shared_key) {
        return clienteRepositorio.buscarById(shared_key);
    }

    @Override
    public List<Clientes> buscarClientesBySharedKey(String shared_key) {
        return clienteRepositorio.buscarBySharedKey(shared_key);
    }

    @Override
    public List<Clientes> listarClientesByBusquedaAvanzada() {
        return clienteRepositorio.busquedavanzada("","","halvarez");
    }
}
