package traccia131118SerComp;

import java.util.Comparator;

class CompByNEsami implements Comparator<Studente> {

	@Override
	public int compare(Studente o1, Studente o2) {
		int n1 = o1.getEsami();
		int n2 = o2.getEsami();
		return (n1 < n2 ? -1 : (n1 == n2 ? 0 : 1));
	}

}
