package com.example.demo.domain.usecase;

import com.example.demo.domain.model.exceptions.ClienteException;
import com.example.demo.domain.model.gateway.BuscarClientesBySharedKeyGateway;
import com.example.demo.domain.model.entities.Clientes;
import com.example.demo.domain.model.utils.ObjectUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BuscarClienteBySharedKeyUseCase {

    @Autowired
    private BuscarClientesBySharedKeyGateway buscarClientesBySharedKeyGateway;

    public List<Clientes> buscarClientesBySharedKey(String shared_key){
        log.info("Comenzo la busqueda del cliente con shared_key el id 0}",shared_key);
        validarCampoBusqueda(shared_key);
        log.info("Finalizo la busqueda del cliente por shared_key con el id 0}",shared_key);
        return buscarClientesBySharedKeyGateway.buscarClientesBySharedKey(shared_key);
    }

    public void validarCampoBusqueda(String shared_key){
        if(ObjectUtils.isNullOrEmpty(shared_key))
            throw ClienteException.Type.CAMPOS_PARA_BUSQUEDA_VACIO.build();
    }
}
