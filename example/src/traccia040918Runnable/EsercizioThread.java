package traccia040918Runnable;

public class EsercizioThread  implements Runnable{
	
	private int x;
	private int y;
	
	public EsercizioThread() {
		x = (int)(Math.random() *20);
		y = (int)(Math.random() *20);
	}
	
	public void run() {
	
		int i = 1;
		while (true) {
			System.out.println(" " + i*(x+y) + " ");
			i++;
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0 ; i<5; i++) {
			Thread t= new Thread(new EsercizioThread());
			t.start();
		}
	}
}
