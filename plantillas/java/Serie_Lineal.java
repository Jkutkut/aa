class Serie_Lineal {
    private static int ITERACIONES = 24;
	private static int INCREMENTO = 7;
	private static int COMIENZO = 17;
	
	public static void main(String[] args) {
		int current = COMIENZO;
		for (int i = 0; i < ITERACIONES; i++) {
			System.out.println(current);
			
			current += INCREMENTO;
		}
	}
}