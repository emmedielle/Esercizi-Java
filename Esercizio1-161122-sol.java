public class EsercizioRimuoviDuplicati {
	
	public static char[] rimuoviDuplicati(char[] in) {
		
		boolean[] duplicati = new boolean[in.length];
		
		for(int i=0; i<in.length; i++)
			duplicati[i]=true;
		
		for(int i=0; i<in.length-1; i++)
			for(int k=i+1; k<in.length; k++)
				if(in[i]==in[k])
					duplicati[k]=false;
		
		for(int i=0; i<duplicati.length; i++)
			System.out.print(duplicati[i]+" ");
		System.out.println();
		
		int conta=0;
		
		for(int i=0; i<duplicati.length; i++)
			if(duplicati[i]==true)
			   conta++;
		System.out.println("Le lettere non duplicate sono: " + conta);
		
		char[] nuovo = new char[conta];
		int indice = 0;
		for(int i=0; i<duplicati.length; i++) {
			if(duplicati[i]==true) {
				nuovo[indice]=in[i];
				System.out.println("Scrivo il carattere "+indice+": "+nuovo[indice]);
				indice++;
			}
		}
		
		for(int i=0; i<nuovo.length; i++)
			System.out.print(nuovo[i]+" ");
		System.out.println();
		
		return nuovo;	
		
	}
	
	
	public static void main(String[] args) {
		
		char[] stringa1= {'b', 'd', 'a', 'b', 'f', 'a', 'g', 'a', 'a', 'f'};
		
		for(int i=0; i<stringa1.length; i++)
			System.out.print(stringa1[i]+" ");
		System.out.println();
		
		char[] stringa2 = rimuoviDuplicati(stringa1);
		
		for(int i=0; i<stringa2.length; i++)
			System.out.print(stringa2[i]+" ");
		System.out.println();
	}
	                                     

}