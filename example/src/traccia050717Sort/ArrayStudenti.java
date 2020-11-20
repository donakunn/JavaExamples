package traccia050717Sort;

import java.util.Arrays;


public class ArrayStudenti {
	private Studente studenti[] = new Studente[10];
	
	public void fill() {
		for (int i= 0; i< 10; i++) {
			studenti[i] = new Studente((int)(Math.random()*20),"ciccio","cappuccio");
		}
	}
	
	public void stampa() {
		for (int i= 0; i< 10; i++) {
			System.out.println(this.studenti[i]);
		}
	}
	
	public void ordina() {
		Arrays.sort(studenti);
	}
	public void ordinaComp() {
		Arrays.sort(studenti, new StudenteComparator());
	}
	
	
	public static void main(String []args) {
		ArrayStudenti studenti = new ArrayStudenti();
		System.out.println("Array di studenti prima dell'ordinamento: ");
		studenti.fill();
		studenti.stampa();
		System.out.println("Array di studenti ordinati con sort(Object[]): ");
		studenti.ordina();
		studenti.stampa();
		System.out.println("Array di studenti ordinati con sort(Obect[],Comparator): ");
		studenti.ordinaComp();
		studenti.stampa();
		
		
		
	}
	

}
