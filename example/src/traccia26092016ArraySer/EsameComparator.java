package traccia26092016ArraySer;

import java.util.Comparator;

class EsameComparator implements Comparator<Esame> {

	@Override
	public int compare(Esame o1, Esame o2) {
		return (o1.getVoto() < o2.getVoto() ? -1 : (o1.getVoto() == o1.getVoto() ? 0 : 1));
	}

}
