package com.examen.res1;

public class Rectangulo implements Forma{

	private int area;
	
	@Override
	public void calcularArea() {
		area = 3 *4;		
	}

	public void calcularArea(int largo, int ancho) {
		area  = largo * ancho;
	}
}
