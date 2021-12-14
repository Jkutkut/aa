package dam.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		int num = Integer.parseInt(sc.nextLine());
		
		int doble = num * 2;
		int triple = num * 3;
		
		System.out.println("El doble de " + num + " es " + doble);
		System.out.println("El triple de " + num + " es " + triple);
		
		sc.close();

	}

}
