package traccia26092016ArraySer;

import java.util.Comparator;

public class Min {
	
	Object minimo(Object a[]) { //utilizzando comparable
		int i = 0;
		Object min = a[0];
			while (i < a.length) {
				if (((Comparable)a[i]).compareTo((Comparable)min) < 0) {
					min = a[i];
					i++;
				}
				else i++;
			}
			return min;
		}
	 
	Object minimo(Object a[], Comparator c) {
		int i = 0;
		Object min = a[0];
			while (i < a.length) {
				if (c.compare(a[i], min) < 0) {
					min = a[i];
					i++;
				}
				else i++;
			}
			return min;
	}

}
