package esercizio2;

import java.util.Scanner;

public class MyMain1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("inserisci un numero intero:");
		
		int num = scanner.nextInt();
		
		String numeroStringa = StampaNumero.tornaStringa(num);
		System.out.println(numeroStringa);
		
		scanner.close();

	}

}
