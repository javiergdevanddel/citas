package com.helloworld.citas.repository;

import com.helloworld.citas.models.Cita;

import java.util.List;

public interface CitaRepository {
	void alta(Cita cita);
	void baja(int indice);
	List<Cita> listar();
}
