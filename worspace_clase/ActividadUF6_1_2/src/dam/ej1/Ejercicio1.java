package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena = sc.nextLine();
		
		int contVocales = 0;
		for (int i = 0; i < cadena.length(); i++) {
			switch (cadena.toUpperCase().charAt(i)) {
			case 'A':
			case 'Á':
			case 'E':
			case 'É':
			case 'I':
			case 'Í':
			case 'O':
			case 'Ó':
			case 'U':
			case 'Ú':
				contVocales++;
				break;
			} 
		}
		
		System.out.println("La cadena tiene " + contVocales + " vocales");
		
		sc.close();
	}
}
