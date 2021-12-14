package dam.pruebas.string;

import java.util.StringTokenizer;

public class PruebasStringtokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Uno dos tres perico de los palotes", "o", true);
		
		System.out.println("Uno dos tres perico de los palotes");
		System.out.println("El StringTokenizer st tiene " + st.countTokens() + " elementos");

		String s;
		while (st.hasMoreTokens()) {
			s = st.nextToken();
			System.out.println("El token '" + s + "' tiene " + s.length() + " caracteres");
			
			/* error: utilizar dos veces el nextToken en la misma iteración
			System.out.println("El token " + st.nextToken() + " tiene " 
			+ st.nextToken().length() + " caracteres"); */
		}
	}

}
