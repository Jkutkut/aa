package dam.ej5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena = sc.nextLine();
		
		String cadenaSE = cadena.replace(" ", "");
		
		System.out.println("OPCIÓN 1");
		System.out.println("La cadena cambiada es : " + cadenaSE);
		
		StringTokenizer st = new StringTokenizer(cadena);
		cadenaSE = "";
		
		while (st.hasMoreTokens()) {
			cadenaSE += st.nextToken();
			
		}
		
		System.out.println("OPCIÓN 2");
		System.out.println("La cadena cambiada es : " + cadenaSE);
		
		sc.close();

	}

}
