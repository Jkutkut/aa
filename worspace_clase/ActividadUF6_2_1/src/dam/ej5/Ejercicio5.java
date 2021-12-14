package dam.ej5;

import java.util.Scanner;

public class Ejercicio5 {
	
	static double[] alturas;
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de alturas");
		int n = Integer.parseInt(sc.nextLine());
		
		alturas = new double[n];
		
		rellenarArray();
		
		// para poder comprobar el resultado, a modo de traza, mostramos el contenido del array
		mostrarArray();
		
		double media = calcularMedia();
		
		realizarAnalisis(media);
		
		sc.close();

	}

	private static void realizarAnalisis(double media) {
		int contSup = 0;
		int contInf = 0;
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > media) {
				contSup++;
			} else if (alturas[i] < media) {
				contInf++;
			}
		}
		
		System.out.println("La media de las alturas es " + media);
		System.out.println("Se han introducido " + contSup + " alturas por encima de la media");
		System.out.println("Se han introducido " + contInf + " alturas por debajo de la media");
		
	}

	private static double calcularMedia() {
		double suma = 0;
		
		for (int i = 0; i < alturas.length; i++) {
			suma += alturas[i]; 
		}
		
		double media = Math.round((suma / alturas.length) * 100) / 100.0;
		
		return media;
		
	}

	private static void mostrarArray() {
		System.out.print("{");
		for (int i = 0; i < alturas.length; i++) {
			if (i != alturas.length - 1) {
				System.out.print(alturas[i] + ", ");
			} else {
				System.out.print(alturas[i]);
			}
		}
		System.out.println("}");
		
	}

	private static void rellenarArray() {
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Intruce la " + (i + 1) + "ª altura");
			alturas[i] = Double.parseDouble(sc.nextLine());
		}
		
	}

}
