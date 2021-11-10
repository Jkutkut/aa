import java.util.Random;

class AleatorioEntre {
    private static Random r;

    public static void main(String[] args) {
        r = new Random();
    }

    /**
	 * @param n1 - Número menor.
	 * @param n2 - Número mayor.
	 * @return Número aleatorio entre n1, n2;
	 */
	private static int aleatorioEntre(int n1, int n2) {
		return r.nextInt(n2 - n1 + 1) + n1;
	}
}