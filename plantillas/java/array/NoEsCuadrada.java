package array;

public class NoEsCuadrada {
	private static boolean noEsCuadrada(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			if (m[i].length != m.length) {
				return false;
			}
		}
		return true;
	}
}
