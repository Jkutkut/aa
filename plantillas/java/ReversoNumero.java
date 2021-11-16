public class ReversoNumero {
    private static int reverso(int n) {
		int t = 0;
		while (n > 0) {
			t *= 10;
			t += n % 10;
			n /= 10;
		}
		return t;
	}
}
