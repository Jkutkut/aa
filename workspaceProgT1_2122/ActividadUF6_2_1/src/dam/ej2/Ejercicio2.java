package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {
	
	static final int TAM = 10;
	static int[] numeros;
	
	public static void main(String[] args) {
		numeros = new int[TAM];
		
		rellenarArray();
		
		mostrarArray();
		
		realizarAnalisis();
	}

	private static void realizarAnalisis() {
		int contPos = 0;
		int contNeg = 0;
		int contCeros = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				contPos++;
			} else if (numeros[i] < 0) {
				contNeg++;
			} else {
				contCeros++;
			}
		}
		
		System.out.println("El array tiene " + contPos + " positivos, " + contNeg 
				+ " negativos y " + contCeros + " ceros");
		
	}

	private static void mostrarArray() {
		System.out.print("{");
		for (int i = 0; i < numeros.length; i++) {
			if (i != numeros.length - 1) {
				System.out.print(numeros[i] + ", ");
			} else {
				System.out.print(numeros[i]);
			}
		}
		System.out.println("}");
		
	}

	private static void rellenarArray() {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el valor " + (i+1));
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		
		sc.close();
		
	}

}
