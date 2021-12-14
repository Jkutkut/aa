package dam.ej10.pojo;

public class Articulo {
	
	private String nombre;
	private int precio;
	
	public Articulo(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return " * " + nombre + " - " + precio + "€";
	}

	public int getPrecio() {
		return precio;
	}


}
