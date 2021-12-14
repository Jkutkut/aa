package dam.ej3.pojo;

public class Alumno {
	
	private String nombre;
	private double notaPP;
	private double notaT1;
	
	public Alumno(String nombre, double notaPP, double notaT1) {
		this.nombre = nombre;
		this.notaPP = notaPP;
		this.notaT1 = notaT1;
	}
	
	public double calcularNotaFinal() {
		double notaFinal = 0;
		
		/*-	Si la nota de la prueba parcial es mayor o igual que 5 y la nota del examen T1 es mayor o igual que 4, haga la media entre las dos. 
		-	Si la nota de la prueba parcial es menor que 5 o la nota del examen T1 es menor que 4, la nota será la nota del examen T1. 
*/
		if (notaPP >= 5 && notaT1 >= 4) {
			notaFinal = (notaPP + notaT1)/2;
		} else {
			notaFinal = notaT1;
		}
		
		return notaFinal;
	}

	@Override
	public String toString() {
		return nombre + "\nNota de la prueba parcial: " + notaPP 
				+ "\nNota del examen T1: " + notaT1;
	}

	
}
