public class IntNumberSize {
    public static int amountDigits(int n) {
		return (int) (Math.log10(n) + 1);
	}
}
