package dam.pruebas.operadores;

public class PruebasOpTern {

	public static void main(String[] args) {
		// Pruebas con el operador condicional ternario
		int m = 7;
		int n = 5;
		System.out.println("m = " + m 
				+ " y n = " + n);
		
		int mayor = (m > n)? m : n;
		System.out.println("mayor = " + mayor);

	}

}
