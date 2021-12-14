package dam.ej4;

import java.util.Scanner;

public class Ejercicio4 {
	static final int TAM = 5;
	static int[] numeros;
	
	public static void main(String[] args) {
		numeros = new int[TAM];
		
		rellenarArray();
		
		mostrarArray();
		
		realizarAnalisis();
	}
	
	private static void realizarAnalisis() {
		int contPosPar = 0;
		int sumaPosPar = 0;
		
		/*for (int i = 0; i < numeros.length; i++) {
			if (i % 2 == 0) {
				contPosPar++;
				sumaPosPar += numeros[i];
			} 
		}*/
		
		for (int i = 0; i < numeros.length; i += 2) {
			contPosPar++;
			sumaPosPar += numeros[i];
		}
		
		double mediaPosPar = (double) sumaPosPar / contPosPar;
		System.out.println("La media de las posiciones pares es " + mediaPosPar);
		
		
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
