package com.example.demo.infraestructura.entrypoints;

import com.example.demo.domain.model.entities.Clientes;
import com.example.demo.domain.usecase.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Cliente {

    @Autowired
    InsertarClienteUseCase insertarClienteUseCase;

    @Autowired
    ListarClienteUseCase listarClienteUseCase;

    @Autowired
    ActualizarClienteUseCase actualizarClienteUseCase;

    @Autowired
    BuscarClienteByIdUseCase buscarClienteByIdUseCase;

    @Autowired
    BuscarClienteBySharedKeyUseCase buscarClienteBySharedKeyUseCase;

    @Autowired
    BusquedaAvanzadaUseCase busquedaAvanzadaUseCase;

    @GetMapping("api/listar")
    public List<Clientes> listarClientes() {
        return listarClienteUseCase.getListaClientes();
    }

    @PostMapping("api/guardar")
    public Clientes guardarClientes(@RequestBody Clientes clientes) {
        return insertarClienteUseCase.insertarCliente(clientes);
    }

    @PostMapping("api/actualizar")
    public Clientes actualizarClientes(@RequestBody Clientes clientes) {
        return actualizarClienteUseCase.actualizarCliente(clientes);
    }

    @GetMapping("api/buscarById/{id}")
    public Clientes getClientesById(@PathVariable("id") String id) {
        return buscarClienteByIdUseCase.buscarClientesById(id);
    }

    @GetMapping("api/buscarBySharedKey/{shared_key}")
    public List<Clientes> listarClientesBYSharedKey(@PathVariable("shared_key") String shared_key){
       return buscarClienteBySharedKeyUseCase.buscarClientesBySharedKey(shared_key);
    }

    @GetMapping("api/busquedaAvanzada")
    public List<Clientes> busquedaAvanzada(){
        return busquedaAvanzadaUseCase.listarBusquedaAvanzada();
    }
}
