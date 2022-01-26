package array;

public class ProductoMatrices {
	private static int[][] productoMatrices(int[][] m1, int[][] m2) {
		// Supongo que ambas matrices son matrices n1xm1 y n2xm2 (que todas las filas y son del mismo tamaño)
		if (m1[0].length != m2.length) {
			return null;
		}
		int[][] result = new int[m1.length][m2[0].length];
		
		for (int i = 0, j, k; i < result.length; i++) {
			for (j = 0; j < result[i].length; j++) {
				result[i][j] = 0;
				for (k = 0; k < result[i].length; k++) {
					result[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		return result;
	}
}
