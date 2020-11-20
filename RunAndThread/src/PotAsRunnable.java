
public class PotAsRunnable implements Runnable{

	private int x;
	private int y;

	public PotAsRunnable(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void run() {
		while (true) {
			int i = 1;
			double z = Math.pow(x,i*y);
			i++;
			System.out.println(z);
		}
	}

	public static void main(String []args) {
		
		for (int i = 1; i<= 10; i++) {
		Thread t = new Thread(new PotAsRunnable(i,i*-1));
		t.start();
		}
		
		
	}



}
