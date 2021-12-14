package dam.pruebas.operadores;

public class PruebasOpRel {

	public static void main(String[] args) {
		int m=2;
		int n=5;
		boolean res;
		System.out.println("m = " + m + " y n = " + n);
		
		res = m > n; //res=false
		System.out.println("res = m > n? " + res);
		
		res = m < n; // res=true
		System.out.println("res = m < n? " + res);

		res = m >= n; // res=false
		System.out.println("res = m >= n? " + res);

		res = m <= n; // res=true
		System.out.println("res = m <= n? " + res);

		res = m == n; // res=false
		System.out.println("res = m == n? " + res);

		res = m != n; // res=true
		System.out.println("res = m != n? " + res);
		 

	}

}
