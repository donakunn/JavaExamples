package tracciaTHREADRUN;

import java.util.Scanner;

public class RunnableScanner implements Runnable{
	
	private int x;
	private Thread t;
	
	public RunnableScanner(int x) {
		this.x = x;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		int i = 1;
		while(true) {
			System.out.println(i*x);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire valori: ");
		for (int i = 0; i < 5; i++) {
			int x = sc.nextInt();
			new Thread(new RunnableScanner(x)).start();
		}
		sc.close();
	}
}
