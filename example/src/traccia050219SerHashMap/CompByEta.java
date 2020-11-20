package traccia050219SerHashMap;

import java.util.Comparator;

class CompByEta implements Comparator<Eta> {

	@Override
	public int compare(Eta e1, Eta e2) {
		return (e1.getEta() < e2.getEta() ? -1 : (e1.getEta() == e2.getEta() ? 0 : 1));
	}

}
