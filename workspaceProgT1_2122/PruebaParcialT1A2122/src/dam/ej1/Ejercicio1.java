package dam.ej1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	
	static final int LIM_SUP = 200;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica la cantidad de aleatorios que deseas que se generen");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el divisor");
		int y = Integer.parseInt(sc.nextLine());
		
		int alea;
		int contMultiplos = 0;
		for (int i = 0; i < x; i++) {
			alea = generarAleatorio();
			System.out.print(alea + " ");
			
			if (alea%y == 0) {
				contMultiplos++;
			}
		}
		
		System.out.println("\nDe " + x + " aleaterios menores que " + LIM_SUP + " generados, " 
		+ contMultiplos + " son múltiplos de " + y);
		
		sc.close();
	}

	private static int generarAleatorio() {
		Random rd = new Random();
		return rd.nextInt(LIM_SUP);
	}

}
