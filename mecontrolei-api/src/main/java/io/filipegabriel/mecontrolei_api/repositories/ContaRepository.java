package io.filipegabriel.mecontrolei_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.filipegabriel.mecontrolei_api.entities.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{

}
