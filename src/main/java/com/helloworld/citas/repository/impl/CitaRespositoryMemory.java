package com.helloworld.citas.repository.impl;

import com.helloworld.citas.models.Cita;
import com.helloworld.citas.repository.CitaRepository;

import java.util.ArrayList;
import java.util.List;

public class CitaRespositoryMemory implements CitaRepository {

	private List<Cita> citas;

	public CitaRespositoryMemory() {
		citas = new ArrayList<>();
	}

	@Override
	public void alta(Cita cita) {
		citas.add(cita);
	}

	@Override
	public void baja(int indice) {
		citas.remove(indice);
	}

	@Override
	public List<Cita> listar() {
		return citas;
	}
}
