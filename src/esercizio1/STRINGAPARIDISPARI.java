package esercizio1;

public class STRINGAPARIDISPARI {

	
	public static void stringaPariDispari() {
		String stringa1 = "mario";
		int lunghezzaStringa = stringa1.length();
		if(lunghezzaStringa %2  == 0) {
			System.out.println("è pari");
		}else {
			System.out.println("èdispari");
		}
	}
	
	
}
