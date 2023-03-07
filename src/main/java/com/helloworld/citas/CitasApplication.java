package com.helloworld.citas;

import com.helloworld.citas.infra.console.ConsoleReader;
import com.helloworld.citas.repository.impl.CitaRespositoryMemory;
import com.helloworld.citas.service.CitaService;
import com.helloworld.citas.service.impl.CitaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitasApplication.class, args);
	}
}
