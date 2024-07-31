package io.filipegabriel.mecontrolei_api.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tb_gasto_unitario")
public class GastoUnitario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Double total;
	
	@OneToMany
	private List<ItemUnitario> itens = new ArrayList<>();
	
	@OneToOne
	private Fatura fatura;
	
	@OneToOne
	private GastosTerceiros gastosterceiros;

}
