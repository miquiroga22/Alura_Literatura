package com.literatura.literatura;

import com.literatura.literatura.controller.Controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

	@Autowired
	private Controlador controlador;

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("Menú Principal:");
			System.out.println("1. Mostrar datos de la API");
			System.out.println("2. Salir");
			System.out.print("Seleccione una opción: ");
			if (scanner.hasNextInt()) {
				opcion = scanner.nextInt();
			} else {
				System.out.println("Por favor, ingrese un número válido.");
				scanner.next(); // Limpiar entrada inválida
				continue;
			}

			switch (opcion) {
				case 1:
					controlador.mostrarDatos();
					break;
				case 2:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción no válida. Intente nuevamente.");
			}

		} while (opcion != 2);

		scanner.close();
	}
}
