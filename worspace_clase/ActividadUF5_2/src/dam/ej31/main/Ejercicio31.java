package dam.ej31.main;

import java.util.Scanner;

import dam.ej31.pojo.Alumno;

public class Ejercicio31 {
	
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		boolean continuar = true;
		
		Alumno alumno;
		double notaFinal;
		int contAp = 0;
		int contAlumn = 0;
		double sumaNotasF = 0;
		
		String nomAlMejorNF = "";
		double mejorNota = -1;
		
		while (continuar) {
			// solicitar los datos de un alumnos
			alumno = solicitarDatos();
			
			// analizaré los datos del alumno
			contAlumn++;
			notaFinal = Math.round(alumno.getNotaFinal() * 100) / 100;
			System.out.println("Nota final de " + alumno.getNombre() + " " + notaFinal);
			
			if (notaFinal >= 5) {
				contAp++;
			}
			
			sumaNotasF += notaFinal; // sumaNotaF = sumaNotaF + notaFinal
			
			if (mejorNota < notaFinal) {
				mejorNota = notaFinal;
				nomAlMejorNF = alumno.getNombre();
			}
			
			// preguntar si desea introducir otro alumno
			System.out.println("¿Desea introducir los datos de otro alumno? (1-SI, 0-NO)");
			continuar = Integer.parseInt(sc.nextLine()) == 1? true : false;
		}
		
		double mediaNotasF = Math.round(sumaNotasF / contAlumn * 100) / 100;
		
		// mostrar resultados
		System.out.println("De " + contAlumn + " alumnos, " + contAp + " han aprobado y " 
		+ (contAlumn - contAp) + " han suspendido");
		System.out.println("La media de las notas finales de todos los alumnos es " 
		+ mediaNotasF);
		System.out.println("El alumno con la mejor nota (" + mejorNota + ") es " + nomAlMejorNF);
		
		sc.close();

	}

	private static Alumno solicitarDatos() {
		System.out.println("Introduce el nombre del alumno");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce la nota de las tareas");
		double notaTar = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce la nota del examen");
		double notaEx = Double.parseDouble(sc.nextLine());
		
		System.out.println("Introduce la nota de actitud");
		double notaAct = Double.parseDouble(sc.nextLine());
		
		return new Alumno(nombre, notaTar, notaEx, notaAct);
	}

}
