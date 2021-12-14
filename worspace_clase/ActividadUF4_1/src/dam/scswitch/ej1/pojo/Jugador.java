package dam.scswitch.ej1.pojo;

public class Jugador {
	
	private String nombre;
	private int edad;
	
	public Jugador(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String indicarCategoria() {
		String categoria = "";
		
		switch (edad) {
		case 7:
		case 8:
			categoria = "Pre-Benjamín";
			break;
		case 9:
		case 10:
			categoria = "Benjamín";
			break;
		case 11:
		case 12:
			categoria = "Alevín";
			break;
		case 13:
		case 14:
			categoria = "Infantil";
			break;
		case 15:
		case 16:
			categoria = "Cadete";
			break;
		case 17:
		case 18:
		case 19:
			categoria = "Juvenil";
			break;
		default:
			categoria = "Fuera de categoría";
			break;
		}
		
		return categoria;
	}
	
	public String getNombre() {
		return nombre;
	}

}
