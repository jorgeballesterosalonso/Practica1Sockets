package com.example.concesionario.modelo.persistencia;

import com.example.concesionario.modelo.entidad.Coche;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoCoche extends JpaRepository<Coche, Integer> {

}
