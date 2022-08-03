package com.examen.res4;

public class TiempoVividoImpl {

	public static void main(String args[]) {
		
		TiempoVivido tiempoVivido = (edad, nombre) -> {
			int dias = edad * 365;
			int meses = edad * 12;
			int horas = dias * 24;
			
			return "Hola " + nombre + " has vivido: días: " + dias 
					+ ", meses: " + meses + ", horas: " + horas; 
		};
		
		System.out.println(tiempoVivido.calcularTiempoVivido(22, "Miguel"));
		
		System.out.println(tiempoVivido.invertirNombre());
	}
}
