package com.example.demo.domain.usecase;

import com.example.demo.domain.model.exceptions.ClienteException;
import com.example.demo.domain.model.gateway.InsertarClienteGateway;
import com.example.demo.domain.model.entities.Clientes;
import com.example.demo.domain.model.utils.ObjectUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InsertarClienteUseCase {

    @Autowired
    private InsertarClienteGateway insertarClienteGateway;

    public Clientes insertarCliente(Clientes clientes){
        log.info("Comenzo la inserccion del cliente {o}",clientes);

        if(ObjectUtils.isNullOrEmpty(clientes))
            throw ClienteException.Type.CLIENTE_NO_ENVIADO.build();

        validarCamposCliente(clientes);

        insertarClienteGateway.insertarCliente(clientes);
        log.info("Inserccion exitosa {0}",clientes.getShared_key());
        return clientes;
    }

    private void validarCamposCliente(Clientes clientes) {
        if(ObjectUtils.isNullOrEmpty(clientes)
                ||ObjectUtils.isNullOrEmpty(clientes.getBusiness_id())
                ||ObjectUtils.isNullOrEmpty(clientes.getEmail())
                ||ObjectUtils.isNullOrEmpty(clientes.getPhone())
                ||ObjectUtils.isNullOrEmpty(clientes.getEnd_date())
                ||ObjectUtils.isNullOrEmpty(clientes.getStart_date())
        )
            throw ClienteException.Type.CAMPOS_IMCOMPLETOS_VALIDAR.build();
    }
}
