package dam.pruebas.main;

import dam.pruebas.pojos.Libro;

public class UsoLibro {

	public static void main(String[] args) {
		Libro libro1 = new Libro();
		libro1.setTitulo("El señor de los anillos");
		libro1.setAutor("J.R.R. Tolkien");
		libro1.setNumPag(1345);
		libro1.setTapasDuras(true);
		
		System.out.println(libro1);
		
		Libro libro2 = new Libro("Sombra y hueso", "Leigh Bardugo", 567);
		System.out.println("\n" + libro2);
	
		Libro libro3 = new Libro("El rey marcado", "Leigh Bardugo", 654, true);
		System.out.println("\n" + libro3);

	}
	
	
	
	
	
	
	
	

}
