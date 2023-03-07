package com.helloworld.citas.infra.config;

import com.helloworld.citas.infra.console.ConsoleReader;
import com.helloworld.citas.repository.CitaRepository;
import com.helloworld.citas.repository.impl.CitaRespositoryMemory;
import com.helloworld.citas.service.CitaService;
import com.helloworld.citas.service.impl.CitaServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CitasConf {
	@Bean
	CitaRepository getCitaRepository() {
		return new CitaRespositoryMemory();
	}

	@Bean
	CitaService getCitaService() {
		return new CitaServiceImpl(getCitaRepository());
	}

	@Bean
	ConsoleReader getConsoleReader() {
		return new ConsoleReader(getCitaService());
	}
}
