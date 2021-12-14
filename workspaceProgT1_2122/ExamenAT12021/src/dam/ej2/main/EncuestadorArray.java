package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Encuesta;

public class EncuestadorArray {

	static Scanner sc;
	static Encuesta[] encuestas;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		sc.close();
		
		mostrarArray();
		
		realizarAnalisis();

	}

	private static void realizarAnalisis() {
		int contCovid = 0;
		int contGrav = 0; 
		Encuesta encuestaMayorLeve = new Encuesta(-1, "NO", "", 6);
		
		for (int i = 0; i < encuestas.length; i++) {
			if (encuestas[i].getRespCovid().equals("SI")) {
				contCovid++;
				
				// preguntamos si lo ha pasado con gravedad alta o muchos síntomas
				if (encuestas[i].getGravedad() > 3 || encuestas[i].calcularNumSintomas() >= 3) {
					contGrav++;
				}
				
				// buscar el encuestado con mayor edad y menor gravedad
				if (i == 0 || encuestas[i].getEdad() > encuestaMayorLeve.getEdad() 
						|| (encuestas[i].getEdad() == encuestaMayorLeve.getEdad()
						&& encuestas[i].getGravedad() < encuestaMayorLeve.getGravedad())) {
					encuestaMayorLeve = encuestas[i];
				}
			}
		}
		
		System.out.println("\n*** Resultado del análisis ***");
		System.out.println("De " + encuestas.length + " encuestas realizadas: ");
		System.out.println(contCovid + " han pasado el COVID");
		System.out.println(contGrav + " han padecido 3 o más síntomas o un nivel de gravedad "
				+ "superior a 3");
		
		if (contCovid == 0) {
			System.out.println("No se ha realizado la encuesta a ninguna persona que " 
					+ "haya pasado el COVID");
		} else {
			System.out.println("El encuestado con mayor edad y menor gravedad es " 
					+ encuestaMayorLeve);
		}
		
	}

	private static void mostrarArray() {
		System.out.println("\n*** Encuestas realizadas ***");
		for (int i = 0; i < encuestas.length; i++) {
			System.out.println("\n" + encuestas[i]);
		}
		
	}

	private static void rellenarArray() {
		int edad;
		String respCovid;
		String sintomas;
		int gravedad;
		for (int i = 0; i < encuestas.length; i++) {
			System.out.println("Introduce la edad del encuestado " + (i+1));
			edad = Integer.parseInt(sc.nextLine());
			
			System.out.println(Encuesta.PREG_COVID);
			System.out.println("(SI/NO)");
			respCovid = sc.nextLine().toUpperCase();
			
			if (respCovid.equals("SI")) {
				// solicitamos síntomas y gravedad
				System.out.println(Encuesta.PREG_SINTOMAS);
				System.out.println("(indicar los síntomas, separados por comas)\n" + 
						"Síntomas respiratorios\n" + 
						"Diarrea\n" + 
						"Cansancio o Malestar\n" + 
						"Perdida del olfato\n" + 
						"Perdida del gusto\n" + 
						"Fiebre\n" + 
						"Sin síntomas");
				sintomas = sc.nextLine();
				
				System.out.println(Encuesta.PREG_GRAVEDAD);
				System.out.println("1: Ninguna, 2: Leve, 3: Media, 4: Alta y 5: Hospitalización");
				gravedad = Integer.parseInt(sc.nextLine());
				
			} else {
				sintomas = "";
				gravedad = 1;
			}
			encuestas[i] = new Encuesta(edad, respCovid, sintomas, gravedad);
		}
		
	}

	private static void inicializarArray() {
		System.out.println("Indica la cantidad de encuestas que se van a realizar");
		int n = Integer.parseInt(sc.nextLine());
		
		encuestas = new Encuesta[n];
		
	}

}
