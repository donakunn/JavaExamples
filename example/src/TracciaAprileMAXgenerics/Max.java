package TracciaAprileMAXgenerics;

import java.util.Comparator;

public class Max {
	
	Object massimo(Object a[]) {
		
		Object max = a[0];
		for(Object obj : a) {
			if (((Comparable) max).compareTo((Comparable)obj) < 0 ) {
				max = obj;
			}
		}
		return max;
	}
	
	Object massimo(Object a[],Comparator c) {
		Object max = a[0];
		for(Object obj : a) {
			if (c.compare(max, obj) < 0 ) {
				max = obj;
			}
		}
		return max;
		
	}
}
