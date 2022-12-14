package com.idat.EFJorgeHuamacctoMicroservicioHospedaje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EfJorgeHuamacctoMicroservicioHospedajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJorgeHuamacctoMicroservicioHospedajeApplication.class, args);
	}

}
