package traccia131118ArrayListReduce;

import java.util.Comparator;

class ComparatorNEsami implements Comparator<Studente>{

	@Override
	public int compare(Studente o1, Studente o2) {
		return (o1.getNumeroEsami() < o2.getNumeroEsami() ? -1 : (o1.getNumeroEsami() == o2.getNumeroEsami() ? 0 : 1));
	}

}
