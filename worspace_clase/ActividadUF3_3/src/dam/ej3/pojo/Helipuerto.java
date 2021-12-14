package dam.ej3.pojo;

public class Helipuerto {
	
	static final double PI = 3.1416;
	
	private String nombre;
	private double radio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularArea() {
		double area = PI * radio * radio;
		return area;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
