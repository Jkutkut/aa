package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {
	
	static final int CANTIDAD = 8;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int numAnt = 0;
		int contParesCons = 0;
		int contImparesCons = 0;
		for (int i = 1; i <= CANTIDAD; i++) {
			System.out.println("Introduce el " + i + "º número");
			num = Integer.parseInt(sc.nextLine());
			
			if (i > 1) {
				if (num%2 == 0 && numAnt%2 == 0) {
					contParesCons++;
				} else if (num%2 != 0 && numAnt%2 != 0) {
					contImparesCons++;
				}
			}
			
			numAnt = num;
		}
		
		System.out.println("Se han introducido " + contParesCons + " consecuciones de pares y \n" 
		+ contImparesCons + " consecuciones de impares");
		
		sc.close();

	}

}
