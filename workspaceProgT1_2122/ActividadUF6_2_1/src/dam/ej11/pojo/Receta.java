package dam.ej11.pojo;

public class Receta {
	
	private String nombre;
	private String dificultad;
	private int tpoEjec;
	
	public Receta(String nombre, String dificultad, int tpoEjec) {
		this.nombre = nombre;
		this.dificultad = dificultad;
		this.tpoEjec = tpoEjec;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDificultad() {
		return dificultad;
	}

	public int getTpoEjec() {
		return tpoEjec;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre 
				+ ", dificultad: " + dificultad + ", tiempo de ejecución: " + tpoEjec + "min";
	}
	
	

}
