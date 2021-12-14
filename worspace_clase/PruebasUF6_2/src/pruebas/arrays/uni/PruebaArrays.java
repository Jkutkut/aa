package pruebas.arrays.uni;

public class PruebaArrays {

	public static void main(String[] args) {
		// Declaración
		// tipo de dato, indicador de array ([]) nombre
		int[] numeros;
		
		// inicialización opción 1
		// palabra clave new, tipo de dato, y tamaño entre corchetes
		// -----------------------------
		// | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
		// -----------------------------
		numeros = new int[7];
		
		numeros[0] = 9;
		// -----------------------------
		// | 9 | 0 | 0 | 0 | 0 | 0 | 0 |
		// -----------------------------
		
		numeros[1] = 7;
		// -----------------------------
		// | 9 | 7 | 0 | 0 | 0 | 0 | 0 |
		// -----------------------------
		
		// rellenando el array con los números pares
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (i+1) * 2;
		}
		mostrarArrayInt(numeros);
		// --------------------------------
		// | 2 | 4 | 6 | 8 | 10 | 12 | 14 |
		// --------------------------------	
		
		// inicialización opción 2
		int[] primos = {2, 3, 5, 7, 11, 13, 17, 19}; 
		// -------------------------------------
		// | 2 | 3 | 5 | 7 | 11 | 13 | 17 | 19 |
		// -------------------------------------
		mostrarArrayInt(primos);
		
		
		String[] colores = {"rojo", "azul", "verde", "amarillo"};
		mostrarArrayString(colores);
		
	}

	private static void mostrarArrayString(String[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("}");
	}

	private static void mostrarArrayInt(int[] array) {
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("}");
	}

}
