package dam.ej3.main;

import java.util.Scanner;

import dam.ej3.pojo.EquipoFutbol;

public class CompararResultados {
	
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		EquipoFutbol eq1 = solicitarDatosEquipo(1);
		EquipoFutbol eq2 = solicitarDatosEquipo(2);
		
		int ptosEq1 = eq1.calcularPuntos();
		int ptosEq2 = eq2.calcularPuntos();
		
		System.out.println("Equipo 1: " + eq1);
		System.out.println("Equipo 2: " + eq2);
		
		if (ptosEq1 > ptosEq2) {
			System.out.println("El Equipo que tiene más puntos es " + eq1.getNombre());
		} else if (ptosEq1 < ptosEq2) {
			System.out.println("El Equipo que tiene más puntos es " + eq2.getNombre());
		} else {
			System.out.println("Los dos equipos tienen los mismos puntos");
		}
		
		sc.close();

	}

	private static EquipoFutbol solicitarDatosEquipo(int i) {
		
		System.out.println("Intrdoduce el nombre del " + i + "º equipo");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce la ciudad");
		String ciudad = sc.nextLine();
		
		System.out.println("Introduce el número de partidos ganados ");
		int numPartG = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el número de partidos empatados ");
		int numPartE = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el número de partidos perdidos ");
		int numPartP = Integer.parseInt(sc.nextLine());
		
		return new EquipoFutbol(nombre, ciudad, numPartG, numPartE, numPartP);
	}

	

}
