package TracciaAprileMAXgenerics;

import java.util.Comparator;

class ComparatorEta implements Comparator<Studente>{

	@Override
	public int compare(Studente o1, Studente o2) {
		return (o1.getEta() < o2.getEta() ? -1 : (o1.getEta() == o2.getEta() ? 0 : 1));
	}
	
}
