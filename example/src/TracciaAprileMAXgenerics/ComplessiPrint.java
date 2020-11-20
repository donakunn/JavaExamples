package TracciaAprileMAXgenerics;

import java.util.List;

public class ComplessiPrint {
	
	public void print(List complessi) {
		for (Object o : complessi) {
			System.out.println(o.toString());
		}
	}
	
	public void printComp(List<Complessi> complessi) {
		for (Complessi o : complessi) {
			System.out.println(o.toString());
		}
	}
}
