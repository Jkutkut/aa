package dam.scwhile.ej4;

public class Ejercicio4 {
	
	static final int LIM = 100;

	public static void main(String[] args) {
		
		int num = 1;
		int suma = 0;
		
		while (num <= LIM) {
			suma = suma + num;
			num++;
		}
		
		System.out.println("La suma de los " + LIM + " primeros números es " + suma);

	}

}
