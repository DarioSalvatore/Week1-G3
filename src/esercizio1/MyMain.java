package esercizio1;

public class MyMain {

	public static void main(String[] args) {
		System.out.println(annoBisestile(2000 ));
		STRINGAPARIDISPARI.stringaPariDispari();
		

	}

	public static boolean annoBisestile(int anno ) {
		 if(anno % 4 == 0 && anno % 100 !=0) {
			 return true;
			 
		 }else if(anno % 400 ==0) {
			 return true;
		 }else {
			 return false;
		 }
	}
}
