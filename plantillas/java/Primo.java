public class Primo {
    private static boolean esPrimo(int n) {
		double end = Math.sqrt(n);
		
		for (int c = 2; c <= end; c++) { // Sólo es necesario hacer hasta la raiz del número
			if (n % c == 0) { // Si es divisible
				return false;
			}
		}
		return true;
	}    
}
