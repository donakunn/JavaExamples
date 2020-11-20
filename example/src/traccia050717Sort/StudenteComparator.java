package traccia050717Sort;

import java.util.Comparator;

class StudenteComparator implements Comparator<Studente>{

	public int compare(Studente o1, Studente o2) {
		return (o1.getMat() < o2.getMat() ? -1 : (o1.getMat() == o2.getMat() ? 0 : 1));
	} 
	
}
