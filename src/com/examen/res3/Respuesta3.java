package com.examen.res3;

import java.util.Scanner;

public class Respuesta3 {
	
	public void generarTriangulo() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de niveles del triangulo rectangulo");
		int niveles = entrada.nextInt();
		
		int numero = 1;
		
		for (int i = 0; i <= niveles; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(numero + " ");
				numero++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Respuesta3 respuesta3 = new Respuesta3();
		respuesta3.generarTriangulo();
	}

}
