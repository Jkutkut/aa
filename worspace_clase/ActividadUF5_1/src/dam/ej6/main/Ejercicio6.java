package dam.ej6.main;

import dam.ej6.pojo.Autor;
import dam.ej6.pojo.Libro;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Autor autor = new Autor("Paul", "Auster");
		Libro libro = new Libro("La trilogía de Nueva York", autor);*/
		
		Libro libro = new Libro("La trilogía de Nueva York", new Autor("Paul", "Auster"));
		
		String texto = libro.getTitulo() + " - " + libro.getAutor();
		System.out.println(texto);
		
		System.out.println(libro);
		

	}

}
