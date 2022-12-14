package com.idat.EFJorgeHuamacctoMicroservicioHospedaje.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFJorgeHuamacctoMicroservicioHospedaje.DTO.TuristaDTO;

@FeignClient(name = "turista-microservicio", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/turista/v1/listar")
	public List<TuristaDTO> listarTurista();

}
