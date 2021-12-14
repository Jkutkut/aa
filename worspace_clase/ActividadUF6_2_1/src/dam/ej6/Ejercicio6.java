package dam.ej6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	
	static final int MAX = 9;
	static int[] numeros;

	public static void main(String[] args) {
		inicilizarArray();
		
		rellenarArray();
		
		mostrarArray();

	}

	private static void mostrarArray() {
		int suma = 0;
		
		System.out.println("Valores generados:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println((i+1) + " - numeros[" + i + "]: " + numeros[i]);
			suma += numeros[i];
		}
		
		System.out.println("La suma de todos los valores es " + suma);
		
	}

	private static void rellenarArray() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generarAleatorio();
		}
		
	}

	private static int generarAleatorio() {
		Random rd = new Random();
		// rd.nextInt(MAX + 1 - MIN) + MIN;
		return rd.nextInt(MAX + 1);
	}

	private static void inicilizarArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de números que se quieren generar");
		int n = Integer.parseInt(sc.nextLine());
		
		numeros = new int[n];
		
		sc.close();
	}

}
