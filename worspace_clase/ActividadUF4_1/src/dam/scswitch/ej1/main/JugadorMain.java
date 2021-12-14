package dam.scswitch.ej1.main;

import java.util.Scanner;

import dam.scswitch.ej1.pojo.Jugador;

public class JugadorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del niño");
		String nom = sc.nextLine();
		
		System.out.println("Introduce la edad de " + nom);
		int edad = Integer.parseInt(sc.nextLine());
		
		Jugador jugador = new Jugador(nom, edad);
		
		System.out.println("Al jugador " + jugador.getNombre() 
							+ " le corresponde la categoría: " + jugador.indicarCategoria());
		
		sc.close();

	}

}
