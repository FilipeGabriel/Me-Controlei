package io.filipegabriel.mecontrolei_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tb_item_mensal")
public class ItemMensal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Integer quantidade;
	
	@Column(nullable = false)
	private Double valor;
	
	@Column(nullable = false)
	private boolean pago = false;
	
	@OneToOne
	private	Banco banco;
	
	@ManyToOne
	private GastoMensal gastoMensal;

}
