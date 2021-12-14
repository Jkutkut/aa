package dam.scdowhile.ej1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un entero positivo");
		int num = Integer.parseInt(sc.nextLine());
		
		int alea;
		do {
			alea = generarAleatorio(num);
			System.out.println(alea);
		} while (alea % 2 != 0);
		
		System.out.println(alea);
		
		sc.close();

	}

	private static int generarAleatorio(int num) {
		Random rd = new Random();
		int alea = rd.nextInt(num);
		return alea;
	}

	
	
}
