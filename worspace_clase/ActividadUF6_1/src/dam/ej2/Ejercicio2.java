package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena = sc.nextLine();
		String cadenaMay = cadena.toUpperCase();
		System.out.println(cadenaMay);
		
		System.out.println("Introduce un caracter");
		char c = sc.nextLine().charAt(0);
		char cMay = Character.toUpperCase(c);
		System.out.println(cMay);
		
		int contC = 0;
		
		for (int i = 0; i < cadenaMay.length(); i++) {
			if (cadenaMay.charAt(i) == cMay) {
				contC++;
			}
		}
		
		System.out.println("OPCIÓN 1: \nEn la cadena " + cadena + " \nla letra " + c 
				+ " se encuentra " + contC + " veces");
		
		// opción 2:
		contC = 0;
		int pos = 0; 
		do {
			pos = cadenaMay.indexOf(cMay, pos);
			
			if (pos != -1) {
				contC++;
				pos++;
			}
			
		} while (pos != -1 && pos < cadenaMay.length());
		
		System.out.println("OPCIÓN 2: \nEn la cadena " + cadena + " \nla letra " + c 
				+ " se encuentra " + contC + " veces");
		
		sc.close();

	}

}
