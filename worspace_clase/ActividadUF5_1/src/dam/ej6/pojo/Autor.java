package dam.ej6.pojo;

public class Autor {
	
	private String nombre;
	private String apellido;
	
	public Autor(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido;
	}
	
	

}
