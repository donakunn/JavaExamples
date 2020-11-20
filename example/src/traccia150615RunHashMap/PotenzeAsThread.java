package traccia150615RunHashMap;

class PotenzeAsThread extends Thread{
private int x;
	
	PotenzeAsThread(int par) {
		x = par;
		setDaemon(true);
		start();
	}
	@Override
	public void run() {
		int i = 1;
		while (true) {
			System.out.println(Math.pow(x, i));
			i++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		

	}
	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			new PotenzeAsThread(((int)(Math.random()*5) +2));
		}

	}
}
