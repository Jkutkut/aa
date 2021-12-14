package dam.pruebas.pojos;

public class Libro {
	
	// ATRIBUTOS o MIEMBROS: variables globales
	private String titulo;
	private String autor;
	private int numPag;
	private boolean tapasDuras;
	
	// CONSTRUCTORES
	public Libro() {}
	
	public Libro(String titulo, String autor, int numPag, boolean tapasDuras) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.tapasDuras = tapasDuras;
	}
	
	public Libro(String titulo, String autor, int numPag) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}
	
	// METODOS DE ACCESO: métodos públicos para acceder a los atributos
	
	// métodos get para obtener los valores de cada atributo
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getNumPag() {
		return numPag;
	}
	
	public boolean getTapasDuras() {
		return tapasDuras;
	}
	
	// métodos set para asignar valor a los atributos
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public void setTapasDuras(boolean tapasDuras) {
		this.tapasDuras = tapasDuras;
	}
	
	@Override
	public String toString() {
		return titulo + " - " + autor + "\nNúmero de páginas: " + numPag + "\nTapa dura? " 
				+ tapasDuras;
	}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	

}
