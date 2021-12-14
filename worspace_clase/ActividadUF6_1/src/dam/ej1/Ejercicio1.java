package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena = sc.nextLine(); // "Hola, Qué tal?"
		
		String cadenaMay = cadena.toUpperCase(); // "HOLA, ¿QUÉ TAL+?"
		
		int contMay = 0;
		int contMin = 0;
		int i = 0;
		while (i < cadena.length()) {
			if (cadena.charAt(i) != ' ' && cadena.charAt(i) != ',' && cadena.charAt(i) != '?') {
				if (cadena.charAt(i) == cadenaMay.charAt(i)) {
					contMay++;
				} else {
					contMin++;
				}
			}
			i++;
		}
		
		System.out.println("OPCIÓN 1: \nLa cadena " + cadena + " \ntiene " 
		+ contMay + " mayúsculas y " + contMin + " minúsculas");
		
		// con código ascci
		int caracter;
		contMay = 0;
		contMin = 0;
		for (int j = 0; j < cadena.length(); j++) {
			caracter = cadena.charAt(j);
			
			if ((caracter >= 65 && caracter <= 90) || 
					caracter == 193 || caracter == 201 || caracter == 205
					 || caracter == 203 || caracter == 218 || caracter == 211) {
				contMay++;
			} else if ((caracter >= 97 && caracter <= 122) || 
					caracter >= 225 || caracter == 233 || caracter == 237
					|| caracter == 243 || caracter == 250 || caracter == 203) {
				contMin++;
			}
		}
		
		System.out.println("OPCIÓN 2: \nLa cadena " + cadena + " \ntiene " 
				+ contMay + " mayúsculas y " + contMin + " minúsculas");
		
		// con Character
		contMay = 0;
		contMin = 0;
		for (int k = 0; k < cadena.length(); k++) {
			if (Character.isUpperCase(cadena.charAt(k))) {
				contMay++;
			} else if (Character.isLowerCase(cadena.charAt(k))) {
				contMin++;
			}
		}
		
		System.out.println("OPCIÓN 3: \nLa cadena " + cadena + " \ntiene " 
				+ contMay + " mayúsculas y " + contMin + " minúsculas");
	
		sc.close();

	}

}
