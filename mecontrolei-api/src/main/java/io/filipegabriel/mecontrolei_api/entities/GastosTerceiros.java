package io.filipegabriel.mecontrolei_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="tb_gastos_terceiros")
public class GastosTerceiros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nomeTerceiro;
	
	private Double totalDivida;
	
	@Column(nullable = false)
	private Double pagamentoParcial;
	
	@Column(nullable = false)
	private	boolean pago = false;
	
	private Usuario usuarioDono;

}
