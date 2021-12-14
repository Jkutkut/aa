package dam.pruebas.operadores;

public class PruebasOpAsig {

	public static void main(String[] args) {
		int num = 3;
		System.out.println("num = " + num);
		
		num += 5; //equivale a num = num + 5
		// num = 8
		System.out.println("num += 5 --> " + num);
		
		num -= 1; // num = 7
		System.out.println("num -= 1 --> " + num);
		
		num *= 3; // num = 21
		System.out.println("num *= 3 --> " + num);
		
		num /= 4; // num = 5
		System.out.println("num /= 4 --> " + num);
		
		num %= 3; // num = 2
		System.out.println("num %= 3 --> " + num);
	


	}

}
