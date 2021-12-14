package dam.ej4;

public class Ejercicio4 {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		int aux = a;
		
		System.out.println("a = " + a + " y b = " + b);
		
		a = b; // a = 7
		b = aux; // b = 3
		
		System.out.print("Después del intercambio: \n");
		System.out.println("a = " + a + " y b = " + b);

	}

}
