package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {
	
	static final int CANTIDAD = 10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		int numAnt = 0;
		int contMayor = 0;
		int contMenor = 0;
		for (int i = 1; i <= CANTIDAD; i++) {
			System.out.println("Introduce el " + i + "º número");
			num = Integer.parseInt(sc.nextLine());
			
			if (i > 1) {
				if (numAnt < num) {
					contMayor++;
				} else if (num < numAnt) {
					contMenor++;
				} 
			}
			
			numAnt = num;
			
		}
		
		System.out.println("De los " + CANTIDAD + " números introducidos: " 
		+ "\n" + contMayor + " son mayores que el anterior y " 
				+ contMenor + " son menores que el anterior");
		
		sc.close();

	}

}
