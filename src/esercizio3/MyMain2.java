package esercizio3;

import java.util.Scanner;

public class MyMain2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String innerStringa = "";
		
		while(!innerStringa.equals(":q")) {
			System.out.print("Inserisci una Stringa :");
			innerStringa = scanner.nextLine();
			if(!innerStringa.equals(":q")) {
				StringheSuddivise.ciclaStringa(innerStringa);
			}
		}
		scanner.close();
	}

}
