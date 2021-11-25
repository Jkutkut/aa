import java.util.StringTokenizer;

public class SumaNumerosString {
    private static int sumaNumerosEnString(String s, String delimitador) {
		int suma = 0;
		StringTokenizer st = new StringTokenizer(s, delimitador);
		
		while (st.hasMoreTokens()) {
			suma += Integer.parseInt(st.nextToken());
		}
		return suma;
	}
}
