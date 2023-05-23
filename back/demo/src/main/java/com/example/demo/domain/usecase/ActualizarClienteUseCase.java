package com.example.demo.domain.usecase;

import com.example.demo.domain.model.exceptions.ClienteException;
import com.example.demo.domain.model.gateway.ActualizarClienteGateway;
import com.example.demo.domain.model.entities.Clientes;
import com.example.demo.domain.model.utils.ObjectUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ActualizarClienteUseCase {

    @Autowired
    private ActualizarClienteGateway actualizarClienteGateway;

    public Clientes actualizarCliente(Clientes clientes){

        log.info("Comenzo la actualizacion del cliente {0}",clientes);
        validarDatosActualizacion(clientes);
        log.info("Finalizo actualizacion {0}",clientes);
        return actualizarClienteGateway.actualizarClientes(clientes);
    }

    private void validarDatosActualizacion(Clientes clientes) {
        if(ObjectUtils.isNullOrEmpty(clientes)
                ||ObjectUtils.isNullOrEmpty(clientes.getBusiness_id())
                ||ObjectUtils.isNullOrEmpty(clientes.getEmail())
                ||ObjectUtils.isNullOrEmpty(clientes.getPhone())
                ||ObjectUtils.isNullOrEmpty(clientes.getShared_key())
                ||ObjectUtils.isNullOrEmpty(clientes.getEnd_date())
                ||ObjectUtils.isNullOrEmpty(clientes.getStart_date())
        )
            throw ClienteException.Type.CAMPOS_IMCOMPLETOS_VALIDAR.build();
    }
}
