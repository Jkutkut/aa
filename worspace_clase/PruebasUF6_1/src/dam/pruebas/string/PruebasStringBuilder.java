package dam.pruebas.string;

import java.util.Scanner;

public class PruebasStringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		String sNum = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(sNum);
		sb.setLength(10);
		System.out.println("El valor de sb es '" + sb.toString() + "'");
		
		String sNumInv = sb.reverse().toString();
		
		System.out.println("El número invertido es " + sNumInv.trim());
		
		sc.close();

	}

}
