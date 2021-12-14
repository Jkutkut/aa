package dam.pruebaswhile;

import java.util.Scanner;

public class PruebasWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean continuar = true;
		
		while (continuar) {
			System.out.println("EJECUTANDO PROGRAMA");
			
			System.out.println("¿Desea seguir ejecutando? 1 - Si, 0 - No");
			int resp = Integer.parseInt(sc.nextLine());
			
			continuar = (resp == 1);
		}
		
		System.out.println("FIN DEL PROGRAMA");
		
		sc.close();

	}

}
