package dam.scif.ej5.main;

import java.util.Scanner;

import dam.scif.ej5.pojo.Rueda;

public class UsoRueda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica la marca de la rueda");
		String marca = sc.nextLine();
		
		System.out.println("Indica el diámetro de la rueda");
		double diametro = Double.parseDouble(sc.nextLine());
		
		System.out.println("Indica el grosor de la rueda");
		double grosor = Double.parseDouble(sc.nextLine());
		
		Rueda rueda = new Rueda(marca, diametro, grosor);
		
		System.out.println("Análisis de diámetro y grosor de la rueda: \n" + rueda);
		System.out.println(rueda.comprobarDiametro());
		System.out.println(rueda.comprobarGrosor());
		
		sc.close();

	}

}
