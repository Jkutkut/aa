package dam.pruebasdowhile;

import java.util.Scanner;

public class PruebasDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean continuar;
		
		do {
			System.out.println("EJECUTANDO PROGRAMA");
			
			System.out.println("¿Desea seguir ejecutando? 1 - Si, 0 - No");
			int resp = Integer.parseInt(sc.nextLine());
			
			continuar = (resp == 1);
		} while (continuar);
		
		System.out.println("FIN DEL PROGRAMA");
		
		sc.close();

	}

}
