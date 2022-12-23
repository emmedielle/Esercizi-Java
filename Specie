import java.util.Scanner;

public class Specie {
	private String nome;
	private int popolazione;
	private double tassoCrescita;

	public void leggiInput() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Qual'e' il nome della specie?");
		nome = tastiera.nextLine();
		System.out.println("A quanto ammonta la popolazione?");
		popolazione = tastiera.nextInt();
		System.out.println("Inserisci il tasso di crescita (% crescita per anno):");
		tassoCrescita = tastiera.nextDouble();
	}

	public void scriviOutput() {
		System.out.println("Nome = " + nome);
		System.out.println("Popolazione = " + popolazione);
		System.out.println("Tasso crescita = " + tassoCrescita + "%");
	}

	/**
	 Restituisce una proiezione della popolazione dopo un numero 
	 specificato di anni
	*/
	public int prediciPopolazione(int anni) {
		int risultato = 0;
		double totalePopolazione = popolazione;
		int contatore = anni;
		
		while ((contatore > 0) && (totalePopolazione > 0)) {
			totalePopolazione = (totalePopolazione + (tassoCrescita / 100) * totalePopolazione);
			contatore--;
		}
		if (totalePopolazione > 0)
			risultato = (int) totalePopolazione;
		return risultato;
	}

	public void setSpecie(String nuovoNome, int nuovaPopolazione, double nuovoTassoCrescita) {
		nome = nuovoNome;
		if (nuovaPopolazione >= 0)
			popolazione = nuovaPopolazione;
		else {
			System.out.println("ERRORE: si sta usando un numero negativo per la popolazione.");
			System.exit(0);
		}
		tassoCrescita = nuovoTassoCrescita;
	}

	public String getNome() {
		return nome;
	}

	public int getPopolazione() {
		return popolazione;
	}

	public double getTassoCrescita() {
		return tassoCrescita;
	}
	
	public boolean equals(Specie altroOggetto) {
		return (nome.equalsIgnoreCase(altroOggetto.nome)) && 
			(popolazione == altroOggetto.popolazione) && 
			(tassoCrescita == altroOggetto.tassoCrescita);
	}
}
