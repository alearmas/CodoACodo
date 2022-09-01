package com.aarmas.digipet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class DigipetApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(DigipetApplication.class);
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(DigipetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("EXECUTING : command line runner");
		System.out.println("¿Cómo se llamará tu mascota?");
		String name = scan.nextLine();
		Pet pet = new Pet(name);
		displayMenu(pet);
	}

	private void displayMenu(Pet pet) {
		System.out.println("¿Qué quieres hacer con " + pet.getName() + "?");
		System.out.println("1. Alimentarlo");
		System.out.println("2. Jugar");
		System.out.println("3. Dormir");
		int num = scan.nextInt();
		switch (num) {
			case 1 :
				pet.feedPet();
				break;
			case 2:
				pet.playPet();
				break;
			case 3:
				pet.sleepPet();
				System.exit(0);
			default:
				System.out.println("Actividad no soportada");
		}
		displayMenu(pet);
	}
}
