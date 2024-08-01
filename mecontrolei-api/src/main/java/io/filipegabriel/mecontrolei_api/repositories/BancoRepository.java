package io.filipegabriel.mecontrolei_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.filipegabriel.mecontrolei_api.entities.Banco;

public interface BancoRepository extends JpaRepository<Banco, Long>{

}
