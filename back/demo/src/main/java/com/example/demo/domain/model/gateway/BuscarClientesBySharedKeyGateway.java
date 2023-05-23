package com.example.demo.domain.model.gateway;

import com.example.demo.domain.model.entities.Clientes;

import java.util.List;

public interface BuscarClientesBySharedKeyGateway {
     List<Clientes> buscarClientesBySharedKey(String shared_key);
}
