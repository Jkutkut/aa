package array;

public class MatrizUnidad {
	private static int[][] matrizUnidad(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0, j; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = 0;
			}
			arr[i][i] = 1;
		}
		return arr;
	}
}
