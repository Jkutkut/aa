package ej158;

import java.util.Scanner;

public class Ej158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		
		int numMuros = 0;
		int altMuroAnt = 0;
		int altMuroPost = 0;
		int contSaltosAr = 0;
		int contSaltosAb = 0;
		for (int i = 0; i < casos; i++) {
			numMuros = sc.nextInt();
			sc.nextLine();
			
			altMuroAnt = sc.nextInt();
			for (int j = 1; j < numMuros; j++) {
				altMuroPost = sc.nextInt();
				
				if (altMuroAnt < altMuroPost) {
					contSaltosAr++;
				} else if (altMuroAnt > altMuroPost) {
					contSaltosAb++;
				}
				
				altMuroAnt = altMuroPost;
			}
			
			System.out.println(contSaltosAr + " " + contSaltosAb);
			
		}
				
		sc.close();

	}

}
