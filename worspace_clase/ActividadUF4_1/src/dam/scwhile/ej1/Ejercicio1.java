package dam.scwhile.ej1;

public class Ejercicio1 {
	
	static final int NUM_REP = 5;
	static final String LINEA = "* * * * *";
	
	public static void main(String[] args) {
		int cont = 0;
		
		while (cont < NUM_REP) {
			System.out.println(LINEA);
			cont++;
		}

	}

}
