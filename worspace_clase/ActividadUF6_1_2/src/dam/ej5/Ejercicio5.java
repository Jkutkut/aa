package dam.ej5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un día de la semana");
		String cadena = sc.nextLine();
		
		switch (cadena.toUpperCase()) {
		case "LUNES":
		case "MARTES":
		case "MIERCOLES":
		case "JUEVES":
		case "VIERNES":
			System.out.println("No es un día del fin de semana");
			break;
		case "SÁBADO":
		case "DOMINGO":
			System.out.println("Es un día del fin de semana");
			break;
		default:
			System.out.println("No es un día de la semana");
			break;
		}
		
		sc.close();

	}

}
