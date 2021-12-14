package dam.ej3;

import java.util.Scanner;

public class Ejercicio3 {
	static final int TAM = 3;
	static int[] numeros;
	
	public static void main(String[] args) {
		numeros = new int[TAM];
		
		rellenarArray();
		
		mostrarArray();
		
		realizarAnalisis();
	}
	
	private static void realizarAnalisis() {
		int contPos = 0;
		int sumaPos = 0;
		int contNeg = 0;
		int sumaNeg = 0;
		double mediaPos = 0;
		double mediaNeg = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				contPos++;
				sumaPos += numeros[i];
			} else if (numeros[i] < 0) {
				contNeg++;
				sumaNeg += numeros[i];
			}
		}
		
		if (contPos > 0) {
			mediaPos = (double) sumaPos / contPos;
			System.out.println("La media de los positivos es " + mediaPos);
		} else {
			System.out.println("No se han introducido positivos");
		}
		
		if (contNeg > 0) {
			mediaNeg = (double) sumaNeg / contNeg;
			System.out.println("La media de los negativos es " + mediaNeg);
		} else {
			System.out.println("No se han introducido negativos");
		}
		
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
