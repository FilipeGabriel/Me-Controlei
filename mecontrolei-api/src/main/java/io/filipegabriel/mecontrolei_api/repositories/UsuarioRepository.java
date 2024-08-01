package io.filipegabriel.mecontrolei_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.filipegabriel.mecontrolei_api.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
