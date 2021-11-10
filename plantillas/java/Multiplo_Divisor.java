
class Multiplo_Divisor {
    /**
	 * @param n - Entero.
	 * @param m - Entero.
	 * @return Si n es divisor de m.
	 */
	private static boolean nDivisorDeM(int n, int m) {
		return m % n == 0;
	}
	
	/**
	 * @param n - Entero.
	 * @param m - Entero.
	 * @return Si el número n es múltiplo de m
	 */
	private static boolean nMultiploDeM(int n, int m) {
		return nDivisorDeM(m, n);
	}
}