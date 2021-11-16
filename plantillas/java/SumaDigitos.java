public class SumaDigitos {
    public static int sumaDigitos(int n) {
        System.out.print("Sumando los dígitos de " + n + "\nDígitos: ");
        int t = 0;
        while (n > 0) { // Suma los dígitos
            t += n % 10;
            System.out.print((n % 10) + " ");
            n /= 10;
        }
        
        System.out.println();
        return t;
    }
}