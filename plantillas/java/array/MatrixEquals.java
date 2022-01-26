package array;

public class MatrixEquals {
	private static boolean matrixEquals(int[][] m1, int[][] m2) {
		if (m1.length != m2.length) {
			return false;
		}
		for (int i = 0, j; i < m1.length; i++) {
			if (m1[i].length != m2[i].length) {
				return false;
			}
			for (j = 0; j < m1[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
