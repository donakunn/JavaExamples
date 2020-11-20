package esempi;

public class ThreadTracciaEsame implements Runnable{
	private int n;
	private int x;
	private int y;
	
	public ThreadTracciaEsame(int n,int x, int y) {
		this.n = n;
		this.x = x;
		this.y = y;
		
	}
	public void run() {
		int i=1;
		while (true) {
			int nSerie= x+i*y;
			System.out.println(n+ ": " + nSerie);
			i++;
		}
	}
	public static void main(String[] args) {
		Runnable t1 = new ThreadTracciaEsame(1,3,2);
		Runnable t2 = new ThreadTracciaEsame(2,4,5);
		Runnable t3 = new ThreadTracciaEsame(3,-2,3);
		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();
		
	}

}
