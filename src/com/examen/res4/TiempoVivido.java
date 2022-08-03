package com.examen.res4;

import java.util.List;
import java.util.Scanner;

public interface TiempoVivido {

	public String calcularTiempoVivido(int edad, String nombre);
	
	public default String invertirNombre() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un nombre");
		String nombre = entrada.nextLine();
		StringBuilder stringBuilder = new StringBuilder(nombre);
		nombre = stringBuilder.reverse().toString();
		return nombre;
	}
}
