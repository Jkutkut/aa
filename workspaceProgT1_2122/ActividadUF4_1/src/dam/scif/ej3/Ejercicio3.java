package dam.scif.ej3;

import java.util.Scanner;

public class Ejercicio3 {
	
	static final int JORNADA_COMPLETA = 40;
	static final int SALARIO_HORA = 16;
	static final int SALARIO_EXTRA = 20;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de horas trabajadas");
		double horasTrabajo = Double.parseDouble(sc.nextLine());
		
		double salarioSemanal = 0;
		if (horasTrabajo > JORNADA_COMPLETA) {
			salarioSemanal = JORNADA_COMPLETA * SALARIO_HORA 
					+ (horasTrabajo - JORNADA_COMPLETA) * SALARIO_EXTRA;
		} else {
			salarioSemanal = horasTrabajo * SALARIO_HORA;
		}
		
		System.out.println("El salario semanal será " + salarioSemanal);
		
		sc.close();

	}

}
