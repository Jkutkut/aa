package dam.ej7;

import java.util.Random;

public class Ejercicio7 {
	
	static final int MAX = 200;
	static final int MIN = 100;

	public static void main(String[] args) {
		Random rnd = new Random();
		//int valor = rnd.nextInt(); // [0, lim_int)
		int valor = rnd.nextInt(MAX + 1 - MIN) + MIN; 
		
		if (valor % 2 == 0) {
			System.out.println(valor + " es PAR");
		} else {
			System.out.println(valor + " es IMPAR");
		}
		
	}

}
