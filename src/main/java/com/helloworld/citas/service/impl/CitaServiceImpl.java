package com.helloworld.citas.service.impl;

import com.helloworld.citas.models.Cita;
import com.helloworld.citas.repository.CitaRepository;
import com.helloworld.citas.service.CitaService;
import java.util.List;

public class CitaServiceImpl implements CitaService {

	CitaRepository citaRepository;

	public CitaServiceImpl(CitaRepository citaRepository) {
		this.citaRepository = citaRepository;
	}

	public void alta(Cita cita){
		citaRepository.alta(cita);
	}
	public void baja(int indice){
		citaRepository.baja(indice);
	}
	public List<Cita> listar(){
		return citaRepository.listar();
	}
}
