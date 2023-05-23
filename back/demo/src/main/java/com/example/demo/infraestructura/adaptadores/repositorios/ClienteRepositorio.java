package com.example.demo.infraestructura.adaptadores.repositorios;

import com.example.demo.domain.model.entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepositorio extends JpaRepository<Clientes, Long> {

    @Query("SELECT C FROM Clientes C WHERE C.shared_key =:shared_key")
    Clientes buscarById(@Param("shared_key") String shared_key);

    @Query("SELECT C FROM Clientes C WHERE C.shared_key LIKE UPPER(CONCAT('%',:shared_key,'%'))  ")
    List<Clientes> buscarBySharedKey(@Param("shared_key") String shared_key);

    @Query("SELECT t FROM Clientes t " +
            "WHERE ( ( :#{#fechaDesde} is not null and t.start_date BETWEEN  :#{#fechaDesde} AND :#{#fechaHasta})" +
            "      OR ( :#{#fechaDesde} is  null ) " +
            "      ) " +
            " AND ( (:#{#shared_key} is not null and t.shared_key  = :#{#shared_key})" +
            "      OR (:#{#shared_key} is  null ) " +
            "      ) " +
            " ORDER BY t.start_date ASC ")
    List<Clientes> busquedavanzada(@Param("fechaDesde") String fechaDesde,@Param("fechaHasta") String fechaHasta,@Param("shared_key") String shared_key);
}
