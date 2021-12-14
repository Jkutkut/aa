package dam.ej10.main;

import java.util.Scanner;

import dam.ej10.pojo.Articulo;

public class Ejercicio10 {

	static Scanner sc;
	static Articulo[] compra;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicilizarArray();
		
		rellenarArray();
		
		mostrarArticulos();
		
		// calcular total y artículo más caro
		realizarCalculo();
		
		sc.close();

	}

	private static void realizarCalculo() {
		int total = 0;
		int mayorPrecio = -1;
		Articulo artMasCaro = null;
		
		for (int i = 0; i < compra.length; i++) {
			total += compra[i].getPrecio();
			
			if (compra[i].getPrecio() > mayorPrecio) {
				artMasCaro = compra[i];
				mayorPrecio = compra[i].getPrecio();
			}
		}
		
		System.out.println("El total de la compra es " + total + " €");
		System.out.println("El artículo de la compra más caro es \n" + artMasCaro);
		
	}

	private static void mostrarArticulos() {
		System.out.println("\nListado de artículos:");
		for (int i = 0; i < compra.length; i++) {
			System.out.println(compra[i]);
		}
		
	}

	private static void rellenarArray() {
		String nom;
		int pre;
		for (int i = 0; i < compra.length; i++) {
			System.out.println("Introduce el nombre del " + (i+1) + "º artículo");
			nom = sc.nextLine();
			
			System.out.println("Introduce el precio del artículo");
			pre = Integer.parseInt(sc.nextLine());
			
			compra[i] = new Articulo(nom, pre);
		}
		
	}

	private static void inicilizarArray() {
		System.out.println("Cuántos artículos tiene la compra");
		int numArt = Integer.parseInt(sc.nextLine());
		
		compra = new Articulo[numArt];
		
	}

}
