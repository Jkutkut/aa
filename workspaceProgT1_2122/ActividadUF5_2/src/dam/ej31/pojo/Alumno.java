package dam.ej31.pojo;

public class Alumno {
	private String nombre;
	private double notaTareas;
	private double notaExamen;
	private double notaActitud;
	
	public Alumno(String nombre, double notaTareas, double notaExamen, double notaActitud) {
		this.nombre = nombre;
		this.notaTareas = notaTareas;
		this.notaExamen = notaExamen;
		this.notaActitud = notaActitud;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getNotaFinal() {
		double notaFinal = 0;
		
		if (notaExamen >= 4 && notaTareas >= 5) {
			notaFinal = notaTareas * 0.6 + notaExamen * 0.3 + notaActitud * 0.1;
		} else {
			notaFinal = notaExamen * 0.9 + notaActitud * 0.1;
		}
		
		return notaFinal;
	}

	@Override
	public String toString() {
		return "Alumno: " + nombre 
				+ "\nNota de Tareas: " + notaTareas 
				+ "\nNota de Examen: " + notaExamen
				+ "\nNota de Actitud: " + notaActitud;
	}
	
	

}
