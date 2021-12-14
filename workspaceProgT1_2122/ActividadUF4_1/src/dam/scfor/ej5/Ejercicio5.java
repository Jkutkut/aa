package dam.scfor.ej5;

public class Ejercicio5 {

	public static void main(String[] args) {
		int sumaP = 0;
		int sumaI = 0;
		
		for (int i = 1; i <= 50; i++) {
			if (i%2 == 0) {
				sumaP += i;
			} else {
				sumaI += i;
			}
			
		}
		
		System.out.println("La suma de los pares entre 1 y 50 es " + sumaP);
		System.out.println("La suma de los impares entre 1 y 50 es " + sumaI);

	}

}
