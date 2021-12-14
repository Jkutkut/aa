package dam.scwhile.ej5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un entero positivo");
		int num = Integer.parseInt(sc.nextLine());
		
		int posDiv = 1;
		while (posDiv <= num/2) {
			if (num % posDiv == 0) {
				System.out.println(posDiv + " es divisor de " + num);
			}
			posDiv++;
		}
		System.out.println(num + " es divisor de " + num);
		
		sc.close();

	}

}
