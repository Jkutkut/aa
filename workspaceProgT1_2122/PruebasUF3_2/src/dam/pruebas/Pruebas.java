package dam.pruebas;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// definimos (declarar e inicializar) una variable local de referencia de tipo String
		String pregunta = "¿Cuál es tu color favorito?";
		
		// definimos una variable local de referencia, es decir, un objeto de tipo scanner
		// que nos facilita comunicación con una fuente externa
		// al crearlo usando el constructor le indico que la fuente es la entrada estándar
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(pregunta);
		String respuesta = teclado.nextLine();
		
		System.out.println("Tu color favorito es " + respuesta);
		
		String pregunta2 = "¿Cuántos años tienes?";
		
		System.out.println(pregunta2);
		String respuesta2 = teclado.nextLine();
		
		int edad = Integer.parseInt(respuesta2);
		// int edad = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Dentro de 10 años tu edad será " + (edad + 10));
		
		teclado.close();

	}

}
