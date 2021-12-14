package dam.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		
		// OPCIÓN 1
		
		StringBuilder sbPalabra = new StringBuilder(palabra);
		String palabraInv = sbPalabra.reverse().toString();
		
		System.out.println("OPCIÓN 1");
		if (palabra.equalsIgnoreCase(palabraInv)) {
			System.out.println("La palabra " + palabra + " es palídromo");
		} else {
			System.out.println("La palabra " + palabra + " no es palídromo");
		}
		
		// OPCIÓN 2
		boolean esPalindromo = true;
		
		for (int i = 0; i < palabra.length()/2 && esPalindromo; i++) {
			
			if (palabra.charAt(i) != palabra.charAt(palabra.length() - (i+1))) {
				esPalindromo = false;
			}
			
		}
		
		System.out.println("OPCIÓN 2");
		if (palabra.equalsIgnoreCase(palabraInv)) {
			System.out.println("La palabra " + palabra + " es palídromo");
		} else {
			System.out.println("La palabra " + palabra + " no es palídromo");
		}
		
		sc.close();

	}

}
