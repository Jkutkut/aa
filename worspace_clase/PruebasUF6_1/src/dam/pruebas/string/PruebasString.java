package dam.pruebas.string;

import java.util.Scanner;

public class PruebasString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
		
		int cantLetras = frase.length();
		System.out.println("La frase introducida tiene " + cantLetras + " caracteres" );
		
		String fraseSE = frase.trim();
		
		System.out.println("La frase sin espacios al principio y al final tiene " 
		+ fraseSE.length() + " caracteres");
		
		System.out.println("Indica una posición");
		int pos = Integer.parseInt(sc.nextLine());
		
		if (pos < 0 || pos >= fraseSE.length()) {
			System.out.println("No hay ninguna letra en la posición indicada");
		} else {
			System.out.println("En la posición " + pos + " hay una '" 
					+ fraseSE.charAt(pos) + "'");
		}
		
		String fraseMay = fraseSE.toUpperCase();
		System.out.println("Frase en mayúsculas: \n" + fraseMay);
		
		System.out.println("Frase en minúsculas: \n" + fraseSE.toLowerCase());
		
		int posComa = fraseSE.indexOf(',');
		
		String saludo = fraseSE.substring(0, posComa);
		
		System.out.println(saludo);
		
		String fraseC = fraseSE.replace(',', '¿');
		System.out.println(fraseC);
		
		int posA = fraseSE.indexOf('a');
		int ultPosA = fraseSE.lastIndexOf('a');
		
		System.out.println("Posiciones de a: " + posA + " y " + ultPosA);
		
		int posQ = fraseSE.indexOf('Q');
		int ultPosQ = fraseSE.lastIndexOf('Q');
		
		System.out.println("Posiciones de q: " + posQ + " y " + ultPosQ);
		
		System.out.println("Es saludo igual a Adios?" + saludo.equals("Adios"));
		System.out.println("Es saludo igual a Hola?" + saludo.equals("Hola"));
		
		System.out.println("Empieza la frase por Adios?" + fraseSE.startsWith("Adios"));
		System.out.println("Empieza la frase por Hola,?" + fraseSE.startsWith("Hola,"));
		
		System.out.println("Acaba la frase con '!'?" + fraseSE.endsWith("!"));
		System.out.println("Acaba la frase con '?'?" + fraseSE.endsWith("?"));
		
		sc.close();

	}

}
