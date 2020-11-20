package esempi;

//Semplice esempio di HashMap.

import java.util.*;

class Counter {
	int i = 1;

	public String toString() {
		return Integer.toString(i);
	}
}

class Statistics {
	public static void main(String[] args) {
		HashMap<Integer, Counter> hm = new HashMap<Integer, Counter>();
		for (int i = 0; i < 10000; i++) {
			// Produce un numero compreso fra 0 e 19:
			Integer r = Integer.valueOf((int) (Math.random() * 20));
			if (hm.containsKey(r))
				((Counter) hm.get(r)).i++;
			else
				hm.put(r, new Counter());
		}
		System.out.println(hm);
	}
}