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
@Table(name="tb_fatura")
public class Fatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Double total;
	
	@Column(nullable = false)
	private	boolean pago = false;
	
	@OneToOne
	private Mes mes;
	
	@OneToOne
	private GastoUnitario gastounitario;
	
	@OneToOne
	private GastoMensal gastoMensal;
	
	@OneToOne
	private GastosTerceiros gastosTerceiros;
	
	@ManyToOne
	private Conta conta;
	
}
