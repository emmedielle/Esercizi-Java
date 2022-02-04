/**Data la massa m di un grave e l'altezza h da cui cade, calcolare il tempo t necessario per raggiungere il suolo*/

import java.util.Scanner;

public class CadutaGrave {

	public static void main(String[] args) {
		
		final double g = 9.81;

		//predisposizione dell'oggetto tastiera
		Scanner tastiera = new Scanner(System.in);
		
		//input della massa m
		System.out.print("Inserisci la massa del grave (Kg): ");
		double m = tastiera.nextDouble();
		
		//input dell'altezza
		System.out.print("Inserisci l'altezza da cui cade il grave (m): ");
		double h = tastiera.nextDouble();
		
		//calcola il tempo t per raggiungere il suolo
		double t = Math.sqrt(2*h/g);
		
		//output di t
		System.out.printf("Il tempo impiegato per cadere da %.1f metri è %.2f secondi",h,t);
	}

}
