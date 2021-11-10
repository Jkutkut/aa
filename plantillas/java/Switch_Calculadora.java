import java.util.Scanner;

public class Switch_Calculadora {
	
	private static float add(float a, float b) {
		return a + b;
	}
	
	private static float minus(float a, float b) {
		return a - b;
	}
	
	private static float times(float a, float b) {
		return a * b;
	}
	
	private static float div(float a, float b) {
		return a / b;
	}
	
	private static float pow(float a, float b) {
		return (float) Math.pow(a, b);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		float a = s.nextInt();
		System.out.print("Enter operation (+, -, *, /, ^): ");
		String op = s.next();
		System.out.print("Enter second number: ");
		float b = s.nextInt();
		
		float result = Float.POSITIVE_INFINITY;
		switch(op) {
			case "+":
				result = Calculadora.add(a, b);
				break;
			case "-":
				result = Calculadora.minus(a, b);
				break;
			case "*":
				result = Calculadora.times(a, b);
				break;
			case "/":
				result = Calculadora.div(a, b);
				break;
			case "^":
				result = Calculadora.pow(a, b);
				break;
			default:
				System.out.println("The operation is not valid!!");
				break;
		}
		
		if (result != Float.POSITIVE_INFINITY) {
			System.out.printf("The operation\n %.3f %s %.3f = %.3f", a, op, b, result);
		}
	}

}
