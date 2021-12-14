package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Encuesta;

public class Encuestador {
	
	static final String RESP_SI = "SI";
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		boolean continuar = true;
		Encuesta encuesta;
		
		int contEncuestas = 0;
		int contCovid = 0;
		int contGravedad = 0;
		Encuesta encuestaMayorLeve = null;
		int mayorEdad = 0;
		int menorGravedad = 6;
		
		while (continuar) {
			
			encuesta = realizarEncuesta();
			contEncuestas++;
			
			// analizar encuesta
			if (encuesta.getRespCovid().equals(RESP_SI)) {
				contCovid++;
				
				if (encuesta.getGravedad() > 3 || encuesta.calcularNumSintomas() >= 3) {
					contGravedad++;
				}
			}
			
			if (encuesta.getEdad() >= mayorEdad && encuesta.getGravedad() < menorGravedad) {
				mayorEdad = encuesta.getEdad();
				menorGravedad = encuesta.getGravedad();
				encuestaMayorLeve = encuesta;
						
			}
			
			System.out.println("Desea realizar otra encuesta? (SI/NO)");
			continuar = sc.nextLine().toUpperCase().equals(RESP_SI)? true : false;
			
		}
	
		System.out.println("De " + contEncuestas + " encuestas realizadas: ");
		System.out.println(contCovid + " han pasado el COVID");
		System.out.println(contGravedad + " han padecido 3 o más síntomas o un nivel de gravedad superior a 3");
		System.out.println("El encuestado con mayor edad y menor gravedad es " + encuestaMayorLeve);
		
		sc.close();

	}

	private static Encuesta realizarEncuesta() {
		System.out.println(Encuesta.PREG_EDAD);
		int edad = Integer.parseInt(sc.nextLine());
		
		System.out.println(Encuesta.PREG_COVID);
		String respCovid = sc.nextLine().toUpperCase();
		
		System.out.println(Encuesta.PREG_SINTOMAS);
		System.out.println("(indicar los síntomas, separados por comas)\n" + 
				"Síntomas respiratorios\n" + 
				"Diarrea\n" + 
				"Cansancio o Malestar\n" + 
				"Perdida del olfato\n" + 
				"Perdida del gusto\n" + 
				"Fiebre\n" + 
				"Sin síntomas");
		String sintomas = sc.nextLine();
		
		System.out.println(Encuesta.PREG_GRAVEDAD);
		System.out.println("1: Ninguna, 2: Leve, 3: Media, 4: Alta y 5: Hospitalización");
		int gravedad = Integer.parseInt(sc.nextLine());
		
		return new Encuesta(edad, respCovid, sintomas, gravedad);
	}

}
