package traccia131118ArrayListReduce;

import java.util.Comparator;

class ComparatorMedia implements Comparator<Studente>{

	@Override
	public int compare(Studente o1, Studente o2) {
		return (o1.getMediaVoti() < o2.getMediaVoti() ? -1 : (o1.getMediaVoti() == o2.getMediaVoti() ? 0 : 1));
	}

}
