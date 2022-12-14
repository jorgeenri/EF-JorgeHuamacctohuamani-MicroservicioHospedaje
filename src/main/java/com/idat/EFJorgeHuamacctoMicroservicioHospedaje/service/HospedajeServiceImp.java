package com.idat.EFJorgeHuamacctoMicroservicioHospedaje.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFJorgeHuamacctoMicroservicioHospedaje.DTO.TuristaDTO;
import com.idat.EFJorgeHuamacctoMicroservicioHospedaje.cliente.OpenFeignClient;
import com.idat.EFJorgeHuamacctoMicroservicioHospedaje.model.Hospedaje;
import com.idat.EFJorgeHuamacctoMicroservicioHospedaje.model.HospedajeDetalle;
import com.idat.EFJorgeHuamacctoMicroservicioHospedaje.model.TuristaHospedajeFK;
import com.idat.EFJorgeHuamacctoMicroservicioHospedaje.repository.DetalleHospedajeRepository;
import com.idat.EFJorgeHuamacctoMicroservicioHospedaje.repository.HospedajeRepository;

@Service
public class HospedajeServiceImp implements HospedajeService {

	@Autowired
	private HospedajeRepository hospedajeRepo;
	
	@Autowired
	private DetalleHospedajeRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	/////
	
	
	@Override
	public void guardarHospedaje(Hospedaje hospedaje) {
		// TODO Auto-generated method stub
		hospedajeRepo.save(hospedaje);

	}

	@Override
	public void asignarHospedaje() {
		// TODO Auto-generated method stub
		
		List<TuristaDTO> listado = client.listarTurista();
		TuristaHospedajeFK fk = null;
		HospedajeDetalle detalle = null;
		
		for(TuristaDTO turistaDTO : listado) {
			fk = new TuristaHospedajeFK();
			fk.setIdTurista(turistaDTO.getCodigo());
			fk.setIdHospesdaje(1);
			
			detalle = new HospedajeDetalle();
			detalle.setFk(fk);
			detalleRepo.save(detalle);
		}

	}

}
