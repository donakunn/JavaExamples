package tracceEsame;

import java.util.LinkedList;

public class Prova {
	public static <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}
	public static void main(String[] args) {
		f(22.5);
		f(new LinkedList<Double>());
		f(new LinkedList<Prova>());
		f(new Prova());
	}

}
