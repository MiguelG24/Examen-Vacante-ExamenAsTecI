package com.examen.res7;

import java.util.Random;
import java.util.Scanner;

public class EncontrarNumero {

	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int numAleatorio = aleatorio.nextInt(6) + 1;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Adivine el numero aleatorio, Ingrese un numero:");
			int numero = entrada.nextInt();
			
			if (numero == numAleatorio) {
				System.out.println("Adivino el numero");
				return;
			} else if (numero > numAleatorio) {
				System.out.println("El numero ingresado fue mayor");
			} else {
				System.out.println("El numero ingresado fue menor");
			}
		}
	}
}
