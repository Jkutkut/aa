package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {
	
	static final int TAM = 10;

	public static void main(String[] args) {
		int[] enteros = new int[TAM];
		
		rellenarArray(enteros);
		
		mostrarArray(enteros);

	}

	private static void mostrarArray(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("}");
		
	}

	private static void rellenarArray(int[] enteros) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Introduce el valor " + (i+1));
			enteros[i] = Integer.parseInt(sc.nextLine());
		}
		
		sc.close();
		
	}

}
