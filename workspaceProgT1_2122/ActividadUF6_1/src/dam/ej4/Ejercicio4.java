package dam.ej4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena = sc.nextLine();
		
		System.out.println("Introduce una letra en minúsculas");
		String letra = sc.nextLine();
		
		String cadenaC = cadena.replace(letra.charAt(0), letra.toUpperCase().charAt(0));
		//String cadenaC = cadena.replace(letra, letra.toUpperCase());
		//String cadenaC = cadena.replaceAll(letra, letra.toUpperCase());
		
		System.out.println("La cadena cambiada es : " + cadenaC);
		
		sc.close();

	}

}
