package dam.ej3;

public class Cuenta {
	
	protected int numeroCuenta;  
	private double saldo;
	
	public Cuenta(int cuenta, double inicial) {
		numeroCuenta = cuenta;  
		saldo = inicial;  
	}  

	public void depositar(double cantidad) {  
		saldo = saldo + cantidad;  
	}  

	public double saldo() {  
		return saldo;  
	}

}
