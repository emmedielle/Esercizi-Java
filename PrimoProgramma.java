//carica la classe Scanner dal package (libreria) java.util
import java.util.Scanner;

//definizione della classe PrimoProgramma
public class PrimoProgramma {
	
	public static void main(String[] args) {
		
		System.out.println("Ciao!");  //invia allop schermo la stringa "Ciao!"
		System.out.println("Eseguo la somma di due numeri");
		System.out.println("Inserisci due nuemri ineteri:");
		
		//dichiarazione di due variabili di tipo nuemrico intero
		int n1, n2;
		
		//creazione dell'oggetto tastiera della classe Scanne
		Scanner tastiera = new Scanner(System.in);   //predispone il programmamma affichè possa leggere l'input dalla tatstiera
		
		n1=tastiera.nextInt();	//legge un numero inetro dalla tastiera
		n2=tastiera.nextInt();
		
		int somma = n1+n2;
		
		System.out.println("La somma dei due numeri è " + somma);
	
	}

}
