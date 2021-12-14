package dam.ej6;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena = sc.nextLine();
		
		int i = 0; 
		while (i < cadena.length()) {
			System.out.println("Letra " + (i+1) + ": "+ cadena.substring(i, i+1));
			
			i++; 
		}
		
		sc.close();
	}
}
