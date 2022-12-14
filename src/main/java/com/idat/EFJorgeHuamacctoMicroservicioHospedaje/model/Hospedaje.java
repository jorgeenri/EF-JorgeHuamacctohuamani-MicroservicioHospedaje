package com.idat.EFJorgeHuamacctoMicroservicioHospedaje.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "hospedajes")
@Entity
@Data
public class Hospedaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospedaje;
	private String nombre;
	
}
