//Determinare se un numero dato in input da tastiera è primo

import java.util.Scanner;

public class NumeriPrimi {

	public static void main(String[] args) {
		
		//creazione oggetto tastiera della classe Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//input da tastiera di un numero intero positivo
		System.out.println("Inserisci un intero positivo: ");
		int num = keyboard.nextInt();
		
		//Determina se num è primo
		boolean primo = true;
		//verifica se ci sono divisori di num diversi dall'unità e da se stesso
		int div=2;
		while(div<num/2) {
			if(num % div == 0) {
				//ho trovato un divisore di num
				primo = false;
			}
			div++;
		}
		
		//output
		if(primo==true) {
			System.out.println(num+" è primo");
		}
		else {
			System.out.println(num+" non è primo");
		}
			
	}

}
