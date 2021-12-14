package dam.scdowhile.ej2;

public class Ejercicio2 {

	public static void main(String[] args) {
		int cont = 100;
		
		do {
			System.out.println(cont);
			cont = cont - 2; // cont -= 2
		} while (cont >= 50);
		
		/*
		for (int i = 100; i >= 50; i = i - 2) {
			System.out.println(i);
		}
		*/

	}

}
