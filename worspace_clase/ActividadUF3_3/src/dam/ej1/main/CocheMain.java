package dam.ej1.main;

import dam.ej1.pojo.Coche;

public class CocheMain {

	public static void main(String[] args) {
		// creamos un objeto de tipo Coche invocando al constructor por defecto
		Coche coche1 = new Coche();
		// asignar al atributo matricula el valor 1234KJH
		coche1.setMatricula("1234KJH");
		
		// Mostramos por consola la velocidad del coche, invocando al método get del atriburo 
		// velocidad
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		
		// invocar al método acelerar que aumenta la velocidad en 10
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		
		// invocamos al método frenar que disminuye la velocidad en 10
		coche1.frenar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		coche1.frenar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		coche1.frenar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		
		coche1.parar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		

	}

}
