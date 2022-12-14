package com.idat.EFJorgeHuamacctoMicroservicioHospedaje.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TuristaHospedajeFK implements Serializable{


	private static final long serialVersionUID = 3945374649116584301L;
	
	@Column(name = "id_hospedaje", nullable = false,unique = true)
	private Integer idHospesdaje;
	
	@Column(name = "id_turista", nullable = false)
	private Integer idTurista;

	public Integer getIdHospesdaje() {
		return idHospesdaje;
	}

	public void setIdHospesdaje(Integer idHospesdaje) {
		this.idHospesdaje = idHospesdaje;
	}

	public Integer getIdTurista() {
		return idTurista;
	}

	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}
	
	
	
	

}
