/**Si legga una sequenza di numeri interi e se ne stampi il valore massimo.
Ci si basi sulle ipotesi seguenti: 
- il valore di ciascun elemento appartenente alla sequenza è > 0 e < 100 
- non si conosce a priori il numero degli elementi appartenenti alla sequenza 
- la fase di acquisizione termina quando viene letto il “terminatore” (valore 999). 
- la sequenza potrebbe essere vuota.*/

import java.util.Scanner;

public class CercaMassimo {

	public static void main(String[] args) {
		
		//predisposizione oggetto tastiera
		Scanner tastiera = new Scanner(System.in);
		
		int scelta;
		
		do {
			int num;
			
			int max=-100;
			do {
				do {
					System.out.println("Inserisci un numero intero compreso tra 0 e 100: ");
					
					num = tastiera.nextInt();
					
					if((num<=0 || num>=100)&&(num!=999)) {
						System.out.println("Hai inserito un valore non valido!");	
					}
				}while((num<=0 || num>=100)&&(num!=999));
				
				if(num!=999) {
					if(num>max)
						max=num;
				}
			}while(num!=999);
			
			
			if(max!=-100)
				System.out.println("Il massimo è " + max);
			else
				System.out.println("Non hai inserito nessun numero!");
			
			do {
				System.out.println("Vuoi continuare? (premi 1 per continuare, 0 per uscire) ");
				scelta = tastiera.nextInt();
			}while(scelta!=1 && scelta!=0);
			
			if(scelta==0)
				System.out.println("Arrivederci!");
			
		}while(scelta==1);
								

	}

}
