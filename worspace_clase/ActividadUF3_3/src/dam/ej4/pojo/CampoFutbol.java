package dam.ej4.pojo;

public class CampoFutbol {
	
	static final int MIN_ANCHO = 64;
	static final int MAX_ANCHO = 75;
	static final int MIN_LARGO = 100;
	static final int MAX_LARGO = 110;
	
	private String nombre;
	private double largo;
	private double ancho;
	private int capacidad;
	
	public CampoFutbol(String nombre, double largo, double ancho, int capacidad) {
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "CampoFutbol: " + nombre + "\nLargo:" + largo + "m, Ancho: " + ancho 
				+ "m \nCapacidad:" + capacidad + " espectadores";
	}
	
	public double calcularArea() {
		double area = largo * ancho;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * largo + 2 * ancho;
		return perimetro;
	}
	
	public boolean esOficialFIFA() {
		boolean esOficial = ancho >= MIN_ANCHO && ancho <= MAX_ANCHO 
				&& largo >= MIN_LARGO && largo <= MAX_LARGO;
		return esOficial;
	}

}
