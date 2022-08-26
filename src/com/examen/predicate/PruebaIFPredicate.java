package com.examen.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PruebaIFPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Empleado> isAdultoMasculino = empleado -> {
			return empleado.getEdad() > 18 && empleado.getGenero().equalsIgnoreCase("M");
		};
		
		Predicate<Empleado> isAdultoFemenino = empleado -> {
			return empleado.getEdad() > 18 && empleado.getGenero().equalsIgnoreCase("F");
		};
		
		BiPredicate<Empleado, Integer> esMayorQue = (empleado, edad) -> {return empleado.getEdad() > edad;};
		
		
		Empleado e1 = new Empleado(1,23,"M","Lorenzo","Espejo");
		Empleado e2 = new Empleado(2,13,"F","Martha","Hernandez");
		Empleado e3 = new Empleado(3,43,"M","Luis","Martinez");
		Empleado e4 = new Empleado(4,26,"M","Jonathan","Castillo");
		Empleado e5 = new Empleado(5,19,"F","Cristina","Cortes");
 
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.addAll(Arrays.asList(new Empleado[]{e1, e2, e3, e4, e5}));

        System.out.println("Adultos Hombres: " + filtroEmpleados(empleados, isAdultoMasculino));
        System.out.println("Adultos Mujeres: " + filtroEmpleados(empleados, isAdultoFemenino));
        
        for (Empleado empleado2 : empleados) {
        	System.out.println( empleado2.getNombre() + " Mayor a 30 años: " + esMayorQue.test(empleado2, 30));
		}
        
        
	}
	
	public static List<Empleado> filtroEmpleados(List<Empleado> empleados, Predicate<Empleado> predicate){
		return empleados.stream().filter( predicate ).collect(Collectors.<Empleado>toList());
	}
	
	public static List<Empleado> filtroEmpleados(List<Empleado> empleados, BiPredicate<Empleado, Integer> predicate){
		return empleados.stream().filter( (Predicate<? super Empleado>) predicate ).collect(Collectors.<Empleado>toList());
	}

}
