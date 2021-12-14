package dam.scfor.ej4;

public class Ejercicio4 {

	public static void main(String[] args) {
		int suma = 0;
		
		for (int i = 1; i <= 15; i++) {
			suma = suma + i*i;
		}
		
		System.out.println("La suma de los 15 primeros cuadrados es " + suma);

	}

}
