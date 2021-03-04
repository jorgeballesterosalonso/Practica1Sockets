package com.ejerciciohash.ejerciciohash.Persistencia;

import com.ejerciciohash.ejerciciohash.Entidad.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer> {
   public Usuario findByNombre(String nombre);
}
