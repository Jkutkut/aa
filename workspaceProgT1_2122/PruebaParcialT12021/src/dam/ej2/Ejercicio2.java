package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	static final int MULTIPLO = 7;
	static final int DIVISOR = 150;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Indica la cantidad de números que se van a introducir");
		int cantidad = Integer.parseInt(sc.nextLine());
		
		int numero;
		int contMultiplos = 0;
		int contDivisores = 0;
		
		for (int i = 1; i <= cantidad; i++) {
			System.out.println("Introduce el " + i + "º número");
			numero = Integer.parseInt(sc.nextLine());
			
			if (numero % MULTIPLO == 0) {
				contMultiplos++;
			}
			
			if (DIVISOR % numero == 0) {
				contDivisores++;
			}
		}
		
		System.out.println("De " + cantidad + " números que se han introducido: " 
				+ "\n" + contMultiplos + " eran múltiplos de " + MULTIPLO 
				+ " y " + contDivisores + " eran divisores de " + DIVISOR);
		
		sc.close();
	

	}

}
