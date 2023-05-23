package com.example.demo.domain.usecase;

import com.example.demo.domain.model.entities.Clientes;
import com.example.demo.domain.model.gateway.BusquedaAvanzadaGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusquedaAvanzadaUseCase {

    @Autowired
    private  BusquedaAvanzadaGateway busquedaAvanzadaGateway;

    public List<Clientes> listarBusquedaAvanzada(){
      return  busquedaAvanzadaGateway.listarClientesByBusquedaAvanzada();
    }
}
