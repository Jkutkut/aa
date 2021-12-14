package dam.ej3.main;

import java.util.Scanner;

import dam.ej3.pojo.Alumno;

public class CalculoNotas {

	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Indica la cantidad de alumnos");
		int cantidad = Integer.parseInt(sc.nextLine());
		
		Alumno alum;
		for (int i = 1; i <= cantidad; i++) {
			alum = solicitarDatosAlumno(i);
			
			System.out.println(alum);
			
			System.out.println("Su nota final es: " + alum.calcularNotaFinal());
			
		}
		sc.close();

	}

	private static Alumno solicitarDatosAlumno(int i) {
		System.out.println("Introduce el nombre del " + i + "º alumno ");
		String nom = sc.nextLine();
		
		System.out.println("Introduce su nota del parcial");
		double notaP = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce su nota del examen T1");
		double notaT1 = Double.parseDouble(sc.nextLine());
		
		return new Alumno(nom, notaP, notaT1);
	}

}
