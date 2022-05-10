package com.reservas.Entity;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="reservas")
public class ReservasEntity {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="id_reserva", unique = true, updatable = false, nullable = false)
	private UUID id_reserva;
	
	@Column(name = "usuario")
	private String usuario;
	 
	@Column(name = "puesto")
	private String puesto;
	
	@Column(name = "fecha")
	private String fecha;
}
