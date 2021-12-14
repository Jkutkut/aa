package dam.pruebasif;

import java.util.Scanner;

public class PruebasIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		int num = Integer.parseInt(sc.nextLine());
		
		// OPCION SIMPLE
		if (num % 7 == 0) {
			System.out.println("El número es múltiplo de 7");
		}
		
		// OPCION SI Y SI NO
		if (num % 2 == 0) {
			System.out.println("El número es PAR");
		} else {
			System.out.println("El número es IMPAR");
		}
		
		// OPCION ANALIZAMOS MÁS DE UNA POSIBILIDAD
		if (num % 6 == 0) {
			System.out.println("El número es múltiplo de 6");
		} else if (num % 3 == 0) {
			System.out.println("El número es múltiplo de 3");
		} else {
			System.out.println("El número no es ni múltiplo de 6 ni de 3");
		}
		
		System.out.println("Fin del programa");
			
		sc.close();

	}

}
