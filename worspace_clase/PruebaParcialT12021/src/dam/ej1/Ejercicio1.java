package dam.ej1;

public class Ejercicio1 {

	static final int PRIMER_TERM = 17;
	static final int CANTIDAD = 24;
	static final int DIFERENCIA = 7;
	
	public static void main(String[] args) {

		// PRIMERA OPCIÓN
		int cont = 0;
		int termino = PRIMER_TERM;
		
		while (cont < CANTIDAD) {
			System.out.print(termino + " ");
			termino = termino + DIFERENCIA;
			cont++;
		}
		System.out.println("\n");
		
		// SEGUNDA OPCIÓN
		termino = PRIMER_TERM;
		for(int cont2 = 1; cont2 <= CANTIDAD; cont2++) {
			System.out.print(termino + " ");
			termino = termino + DIFERENCIA;
		}
		System.out.println("\n");
		
		// TERCERA OPCIÓN
		for (int i = PRIMER_TERM; i < PRIMER_TERM + CANTIDAD * DIFERENCIA; i = i + DIFERENCIA) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// CUARTA OPCIÓN
		for (int i = 0; i < CANTIDAD; i++) {
			System.out.print((PRIMER_TERM + i * DIFERENCIA) + " ");
		}
	}

}
