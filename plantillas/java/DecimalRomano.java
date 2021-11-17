public class DecimalRomano {
    private static final int[] VALUES = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
	private static final String[] EQUIVALENT = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
	
    public static String decimalRomano(int num) {
		if (num <= 0 || num > 3000) {
			return null;
		}
		
		String romano = "";
		for (int i = VALUES.length - 1; i >= 0; i--) {
			while (num >= VALUES[i]) {
				romano += EQUIVALENT[i];
				num -= VALUES[i];
			}
		}
		return romano;
	}
}
