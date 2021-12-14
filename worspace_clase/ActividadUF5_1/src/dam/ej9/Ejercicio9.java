package dam.ej9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero positivo");
		int num = Integer.parseInt(sc.nextLine()); // 7951
		int numInv = invertir(num);
		
		System.out.println(numInv);
		
		boolean numEsPrimo = comprobarPrimo(num);
		boolean numInvEsPrimo = comprobarPrimo(numInv);
		
		if (numEsPrimo && numInvEsPrimo) {
			System.out.println("El número " + num 
					+ " es omirp, porque tanto el como su invertido son primos");
		} else if (numEsPrimo) {
			System.out.println("El numero " + num 
					+ " no es omirp porque su invertido no es primo");
		} else if (numInvEsPrimo) {
			System.out.println("El número " + num 
					+ " no es omirp porque, aunque su invertido es primo, el no lo es");
		} else {
			System.out.println("El número " + num 
					+ " no es omirp porque ni el ni su invertido son primos");
		}
		
		sc.close();

	}

	private static boolean comprobarPrimo(int num) {
		double end = Math.sqrt(num);
		boolean esPrimo = true;
		
		for (int c = 2; c <= end && esPrimo; c++) { // Sólo es necesario hacer hasta la raiz del número
			if (num % c == 0) { // Si es divisible
				esPrimo = false;
			}
		}
		return esPrimo;
	}

	private static int invertir(int num) {
		int numInv = 0;
		int c = num; 
		int r;
		
		while (c > 0) {
			r = c % 10; 
			c = c / 10; 
			numInv = numInv*10 + r; 
		}
		return numInv;
	}

}
