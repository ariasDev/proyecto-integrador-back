package com.reservas.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reservas.Entity.ReservasEntity;

@Repository
public interface ReservasRepository extends CrudRepository<ReservasEntity, UUID>{
    List<ReservasEntity> findAllByUsuario(String usuario);
}
