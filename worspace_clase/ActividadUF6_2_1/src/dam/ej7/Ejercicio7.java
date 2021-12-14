package dam.ej7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	static int[] numeros;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		mostrarMayor();
		
		sc.close();

	}

	private static void mostrarMayor() {
		int mayor = 0;
		
		System.out.print("{");
		for (int i = 0; i < numeros.length; i++) {
			if (i != numeros.length - 1) {
				System.out.print(numeros[i] + ", ");
			} else {
				System.out.print(numeros[i]);
			}
			
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		System.out.println("}");
		
		System.out.println("\nEl mayor valor es " + mayor);
		
		
	}

	private static void rellenarArray() {
		System.out.println("Indica el límite inferior, mayor que cero, para generar números");
		int limInf = Integer.parseInt(sc.nextLine());
		
		System.out.println("Indica el límite superior, mayor que el límite inferior, para generar números");
		int limSup = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generarAleatorio(limInf, limSup);
		}
		
	}

	private static int generarAleatorio(int limInf, int limSup) {
		Random rd = new Random(); 
		
		int alea = 0;
		do {
			alea = rd.nextInt(limSup + 1 - limInf) + limInf;
		} while (!esPrimo(alea));
		
		return alea;
	}

	// retornará true si alea es primo y false si no lo es
	private static boolean esPrimo(int num) {
		// Sólo es necesario recorrer hasta la raiz del número
		double end = Math.sqrt(num);
		boolean esPrimo = true;
		
		if (num != 1) {
			for (int c = 2; c <= end && esPrimo; c++) { 
				if (num % c == 0) { // Si es divisible
					esPrimo = false;
				}
			}
		} else {
			esPrimo = false;
		}
		
		return esPrimo;
	}

	private static void inicializarArray() {
		System.out.println("Introduce la cantidad de números a generar");
		int n = Integer.parseInt(sc.nextLine());
		
		numeros = new int[n];
		
	}

}
