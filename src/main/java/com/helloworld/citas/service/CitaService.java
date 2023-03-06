package com.helloworld.citas.service;

import com.helloworld.citas.models.Cita;

import java.util.List;

public interface CitaService {
	void alta(Cita cita);
	void baja(int indice);
	List<Cita> listar();
}
