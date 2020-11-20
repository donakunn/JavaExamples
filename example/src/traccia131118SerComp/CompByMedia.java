package traccia131118SerComp;

import java.util.Comparator;

class CompByMedia implements Comparator<Studente> {
	public int compare(Studente s1, Studente s2) {
		double n1 = s1.getMedia();
		double n2 = s2.getMedia();
		return (n1 < n2 ? -1 : (n1 == n2 ? 0 : 1));
	}
}
