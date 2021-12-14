package dam.scfor.ej1;

public class Ejercicio1 {

	static final int TABLA = 7;
	
	public static void main(String[] args) {
		System.out.println("*** Tabla del " + TABLA + " ***");
		for (int i = 0; i <= 10; i++) {
			System.out.println(TABLA + " x " + i + " = " + (TABLA*i));
		}

	}

}
