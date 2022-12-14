package com.idat.EFJorgeHuamacctoMicroservicioHospedaje.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFJorgeHuamacctoMicroservicioHospedaje.model.HospedajeDetalle;

public interface DetalleHospedajeRepository extends JpaRepository<HospedajeDetalle,Integer> {

}
