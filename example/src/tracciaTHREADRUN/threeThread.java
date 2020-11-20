package tracciaTHREADRUN;

public class threeThread extends Thread{
	private double times;
	private char value;
	private int millisec;
	
	threeThread(double times, char value, int millisec) {
		this.times = times;
		this.value = value;
		this.millisec = millisec;
		start();
	}
	
	public void run() {
		for (int i = 0; i < times; i++) {
		System.out.println(value);
		try {
			sleep(millisec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String args[]) {
		new threeThread(15,'A',1000);
		new threeThread(15,'B',2000);
		new threeThread(Double.POSITIVE_INFINITY,'C',3000);
	}
}
