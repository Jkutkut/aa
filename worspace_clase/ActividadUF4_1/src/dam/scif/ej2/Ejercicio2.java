package dam.scif.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 5 enteros separados por espacios");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		sc.nextLine();
		
		sc.close();
			
		System.out.println("Encontrar el mayor entre: " + n1 + ", " + n2 + ", " + n3 
				+ ", " + n4 + " y " + n5 + "\n");
		
		if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
			System.out.println("El mayor es " + n1);
		} else if (n2 > n3 && n2 > n4 && n2 > n5) {
			System.out.println("El mayor es " + n2);
		} else if (n3 > n4 && n3 > n5) {
			System.out.println("El mayor es " + n3);
		} else if (n4 > n5) {
			System.out.println("El mayor es " + n4);
		} else {
			System.out.println("El mayor es " + n5);
		}
		
		// OPCIÓN 2
		int mayor = n1;
		
		if (n2 > mayor) {
			mayor = n2;
		}
		
		if (n3 > mayor) {
			mayor = n3;
		}
		
		if (n4 > mayor) {
			mayor = n4;
		}

		if (n5 > mayor) {
			mayor = n5;
		}
		
		System.out.println("\nEl mayor es " + mayor);
	}

}
