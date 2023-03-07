package com.helloworld.citas.infra.console;

import com.helloworld.citas.models.Cita;
import com.helloworld.citas.service.CitaService;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConsoleReader {

	CitaService citaService;
	SimpleDateFormat fechaFormateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("es_ES"));

	public ConsoleReader(CitaService citaService) {
		this.citaService = citaService;
	}

	@PostConstruct
	public void init(){
		Scanner sc = new Scanner(System.in);
		int opcion = 1;
		String entradaConsola;
		while (opcion != 0) {

			System.out.println("Menu por consola");
			System.out.println("1.- Registrar nueva cita");
			System.out.println("2.- Modificar una cita");
			System.out.println("3.- Borrar una cita");
			System.out.println("4.- Listar todas las citas");
			System.out.println("0.- Salir.");
			System.out.println("Ingrese la accion a realizar: ");
			entradaConsola = sc.next();
			try {
				opcion = Integer.parseInt(entradaConsola);
			} catch (Exception e){
				System.out.println("Opción no valida, ingresa un número");
			}
			switch (opcion){
				case 0:
					System.out.println("Hasta luego!!");
					break;
				case 1:
					System.out.println("Ingrese nombre: ");
					String nombre = sc.next();
					System.out.println("Ingrese apellidos: ");
					String apellidos = sc.next();
					System.out.println("Ingrese fecha (dd/MM/yyyy HH:mm:ss): ");
					String fecha = sc.nextLine();

					Date fechaCita;
					try {
						fechaCita = fechaFormateador.parse(sc.nextLine());
						citaService.alta(new Cita(nombre, apellidos, fechaCita));
					} catch (ParseException e) {
						System.out.println("Formato de fecha no válido");
					}
					break;
				case 2:
					//TODO Por desarrollar
					break;
				case 3:
					//TODO Por desarrollar
					break;
				case 4:
					List<Cita> citas = citaService.listar();
					System.out.println("Listado de citas:");
					for (Cita cita: citas) {
						System.out.printf("Id %s, nombre: %s, apellidos: %s, fecha: %s", citas.indexOf(cita), cita.getNombre(), cita.getApellidos(), fechaFormateador.format(cita.getFecha()));
						System.out.println();
					}
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		}
	}
}
