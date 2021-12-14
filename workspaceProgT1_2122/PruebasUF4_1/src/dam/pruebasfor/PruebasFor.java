package dam.pruebasfor;

import java.util.Scanner;

public class PruebasFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el número de repeticiones");
		int numRep = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= numRep; i++) {
			System.out.println("Repetición " + i);
		}
		
		// convertimos el for en un while
		int i = 1;
		while (i <= numRep) {
			System.out.println("Repetición " + i);
			i++;
		}
		
		System.out.println("FIN DEL PROGRAMA");
		
		sc.close();

	}

}
