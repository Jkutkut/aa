package dam.ej8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el día de tu fecha de nacimiento");
		int dia = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el mes de tu fecha de nacimiento");
		int mes = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el año de tu fecha de nacimiento");
		int anio = Integer.parseInt(sc.nextLine());
		
		int suma = dia + mes + anio;  
		
		int c;
		
		while (suma >= 10) {
			c = suma; 
			suma = 0;
			
			while (c > 0) {
				suma += c % 10; 
				c = c / 10; 
			}
		}
		
		System.out.println("El número de la suerte es: " + suma);
		
		sc.close();

	}

}
