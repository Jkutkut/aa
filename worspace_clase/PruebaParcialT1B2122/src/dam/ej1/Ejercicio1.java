package dam.ej1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	
	static final int CANTIDAD = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el límite de los aleatorios");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el múltiplo");
		int y = Integer.parseInt(sc.nextLine());
		
		int alea;
		int contDivY = 0;
		
		for (int i = 0; i < CANTIDAD; i++) {
			alea = generarAleatorio(x);
			System.out.print(alea + " ");
			
			if (y % alea == 0) {
				contDivY++;
			}
			
		}
		System.out.println("\nDe los " + CANTIDAD + " aleatorios menores que " 
		+ x + " generados, \n" + contDivY + " son divisores de " + y);
		
		sc.close();

	}

	private static int generarAleatorio(int x) {
		Random rd = new Random();
		// rd.nextInt(MAX + 1 - MIN) + MIN --> [MIN, MAX]
		return rd.nextInt(x - 1) + 1; // --> [1, X)
	}

}
