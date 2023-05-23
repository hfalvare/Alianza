package com.example.demo.domain.model.gateway;

import com.example.demo.domain.model.entities.Clientes;

public interface BuscarClienteByIdGateway {

    Clientes buscarById(String id);
}
