package com.examen.res8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Respuesta8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Ingrese 3 numeros, ingrese el primero y presione Enter");
		System.out.println("a: ");
		a = entrada.nextInt();
		
		System.out.println("b: ");
		b = entrada.nextInt();
		
		System.out.println("c: ");
		c = entrada.nextInt();
		
		List<Integer> lista = new ArrayList<>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		Collections.sort(lista);
		Collections.reverse(lista);
		
		for (Integer numero : lista) {
			System.out.print(numero + " ");
		}
		
	}

}
