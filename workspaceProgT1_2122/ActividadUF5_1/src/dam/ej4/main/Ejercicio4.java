package dam.ej4.main;

import dam.ej4.pojo.Clase4;

public class Ejercicio4 {

	public static void main(String[] args) {
		Clase4 obj1 = new Clase4(7);
		System.out.println("obj1.prop:" + obj1.getProp());
		System.out.println();
		
		Clase4 obj2 = new Clase4(9);
		System.out.println("obj1.prop:" + obj1.getProp());
		System.out.println("obj2.prop:" + obj2.getProp());
		System.out.println();
		
		obj2 = obj1;
		
		System.out.println("obj1.prop:" + obj1.getProp());
		System.out.println("obj2.prop:" + obj2.getProp());

	}

}
