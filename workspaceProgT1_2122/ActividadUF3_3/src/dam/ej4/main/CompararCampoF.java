package dam.ej4.main;

import java.util.Scanner;

import dam.ej4.pojo.CampoFutbol;

public class CompararCampoF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del primer campo");
		String nom = sc.nextLine();
		
		System.out.println("Indica el largo");
		double largo = Double.parseDouble(sc.nextLine());
		
		System.out.println("Indica el ancho");
		double ancho = Double.parseDouble(sc.nextLine());
		
		System.out.println("Indica la capacidad de espectadores");
		int cap = Integer.parseInt(sc.nextLine());
		
		CampoFutbol cf1 = new CampoFutbol(nom, largo, ancho, cap);
		
		System.out.println("Introduce el nombre del segundo campo");
		nom = sc.nextLine();
		
		System.out.println("Indica el largo");
		largo = Double.parseDouble(sc.nextLine());
		
		System.out.println("Indica el ancho");
		ancho = Double.parseDouble(sc.nextLine());
		
		System.out.println("Indica la capacidad de espectadores");
		cap = Integer.parseInt(sc.nextLine());
		
		CampoFutbol cf2 = new CampoFutbol(nom, largo, ancho, cap);
		
		System.out.println(cf1);
		System.out.println(cf2);
		
		
		double pcf1 = cf1.calcularPerimetro();
		double pcf2 = cf2.calcularPerimetro();
		
		CampoFutbol cfMayorArea = cf1.calcularArea() >= cf2.calcularArea()? cf1 : cf2;
		
		CampoFutbol cfMayorPer = pcf1 >= pcf2? cf1 : cf2;
		
		String nomCFMayorCap = cf1.getCapacidad() > cf2.getCapacidad()? cf1.getNombre() : 
																		cf2.getNombre();
		
		System.out.println("El campo de fútbol con mayor área de juego es " + cfMayorArea);
		
		System.out.println("El campo de fútbol con mayor perímetro es " + cfMayorPer);
		
		System.out.println("El campo de fútbol con mayor capacidad es " + nomCFMayorCap);
		
		System.out.println("Es el campo " + cf1.getNombre() + " oficial según la FIFA? " 
							+ cf1.esOficialFIFA());
		
		System.out.println("Es el campo " + cf2.getNombre() + " oficial según la FIFA? " 
				+ cf2.esOficialFIFA());
		
		
		
		sc.close();

	}

}
