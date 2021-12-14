package dam.ej3.main;

import java.util.Scanner;

import dam.ej3.pojo.Helipuerto;

public class CompararHelipuertos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del primer helipuerto");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce el radio del primer helipuerto");
		double radio = Double.parseDouble(sc.nextLine());
		
		Helipuerto h1 = new Helipuerto();
		h1.setNombre(nombre);
		h1.setRadio(radio);
		
		System.out.println("Introduce el nombre del segundo helipuerto");
		nombre = sc.nextLine();
		
		System.out.println("Introduce el radio del segundo helipuerto");
		radio = Double.parseDouble(sc.nextLine());
		
		Helipuerto h2 = new Helipuerto();
		h2.setNombre(nombre);
		h2.setRadio(radio);
		
		double a1 = h1.calcularArea();
		double a2 = h2.calcularArea();
		
		String nombreMayorH = (a1 > a2)? h1.getNombre() : 
										(a2 < a1)? h2.getNombre() : "Son iguales";
		
		System.out.println("El helipuerto con mayor área de aterrizaje es " + nombreMayorH);
		
		sc.close();

	}

}
