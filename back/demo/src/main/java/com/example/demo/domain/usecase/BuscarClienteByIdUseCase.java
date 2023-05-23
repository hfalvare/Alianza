package com.example.demo.domain.usecase;

import com.example.demo.domain.model.exceptions.ClienteException;
import com.example.demo.domain.model.gateway.BuscarClienteByIdGateway;
import com.example.demo.domain.model.entities.Clientes;
import com.example.demo.domain.model.utils.ObjectUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BuscarClienteByIdUseCase {

    @Autowired
    private BuscarClienteByIdGateway buscarClienteByIdGateway;

    public Clientes buscarClientesById(String id){
        log.info("Comenzo la busqueda del cliente con el id 0}",id);
        validarCamposBusqueda(id);
        log.info("Finalizo la busqueda del cliente con el id 0}",id);
        return buscarClienteByIdGateway.buscarById(id);
    }

    private void validarCamposBusqueda(String id){
        if(ObjectUtils.isNullOrEmpty(id)){
            ClienteException.Type.CAMPOS_PARA_BUSQUEDA_VACIO.build();
        }
    }
}
