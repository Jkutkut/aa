package array;

public class MatrixMax {
	private static void getMaximo(int[][] arr) {
		int maxR = 0, maxC = 0;
		for (int i = 0, j; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > arr[maxR][maxC]) {
					maxR = i;
					maxC = j;
				}
			}
		}
		System.out.printf("El valor máximo del array se encuentra en la posición (%d, %d) con un valor = %d\n", maxR, maxC, arr[maxR][maxC]);
	}
}
