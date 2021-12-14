package dam.scwhile.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica cuántos números se van a introducir");
		int cantidad = Integer.parseInt(sc.nextLine());
		
		int num;
		int contPos = 0;
		int contNeg = 0;
		int contCeros = 0;
		while (cantidad > 0) {
			System.out.println("Introduce un número");
			num = Integer.parseInt(sc.nextLine());
			
			if (num > 0) {
				contPos++;
			} else if (num < 0) {
				contNeg++;
			} else {
				contCeros++;
			}
			
			cantidad--;
		}
		
		System.out.println("Se han introducido " + contPos + " positivos, " 
							+ contNeg + " negativos y " + contCeros + " ceros");
		
		sc.close();

	}

}
