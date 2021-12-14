package dam.ej1;

import java.util.Scanner;

public class Telesilla {
	
	static final int TOTAL_PERSONAS = 15;
	static final int MAX_PERSONAS = 4;
	static final int MIN_PESO = 200;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contPersTel = 0;
		int pesoPers = 0;
		int pesoTel = 0;
		
		for (int i = 1; i <= TOTAL_PERSONAS; i++) {
			System.out.println("Indica el peso de la persona " + i);
			pesoPers = Integer.parseInt(sc.nextLine());
			
			// sube al telesilla
			pesoTel += pesoPers;
			contPersTel++;
			
			if (contPersTel == MAX_PERSONAS || pesoTel >= MIN_PESO) {
				System.out.println("El telesilla puede salir ya, , han subido " + contPersTel 
						+ " personas y suman " + pesoTel + " kg");
				pesoTel = 0;
				contPersTel = 0;
			} else {
				if (i == TOTAL_PERSONAS) {
					System.out.println("El telesilla no puede salir porque no se alcanza el máximo de "
						+ "personas ni el mínimo de peso. Personas: " + contPersTel + " y peso: " + pesoTel);
				} else {
					System.out.println("Debe subir otra persona");
				}
			}
		}

		sc.close();
	}

}
