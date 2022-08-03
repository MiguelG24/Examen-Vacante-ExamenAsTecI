package com.examen.res2;

import java.util.ArrayList;
import java.util.List;

public class Respuesta2 {

	public void iterarLista() {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("juan");
		lista.add("pedro");
		lista.add("jose");
		lista.add("maria");
		lista.add("sofia");
		
		String primerNombre = lista.get(0);
		
		String resultado = primerNombre.toUpperCase().charAt(0) + primerNombre.substring(1).toLowerCase();
		
		lista.set(0, resultado);
		
		for (String nombre : lista) {
			System.out.println(nombre);
		}
		
	}
	
	public static void main(String args[]) {
		Respuesta2 respuesta2 = new Respuesta2();
		respuesta2.iterarLista();
	}
}
