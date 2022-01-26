package array;

public class EsSimetrica {
	/**
	 * Basado en https://es.wikipedia.org/wiki/Matriz_sim%C3%A9trica
	 */
	public static boolean esSimetrica(int arr[][]) {
		for (int i = 0, j; i < arr.length; i++) {
			if (arr.length != arr[i].length) {
				return false;
			}
			for (j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != arr[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
}
