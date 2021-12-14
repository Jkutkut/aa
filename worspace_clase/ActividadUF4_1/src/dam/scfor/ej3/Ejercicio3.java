package dam.scfor.ej3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 1 * 2 * 3 * ... * 20
		long producto = 1;
		
		for (int i = 1; i <= 20; i++) {
			producto = producto * i;
		}
		
		System.out.println("El producto de los 20 primeros número naturales es " 
							+ producto);
		
		

	}

}
