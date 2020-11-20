package traccia150615RunHashMap;

class Potenze implements Runnable{

	private int x;
	
	Potenze(int par) {
		x = par;
		
	}
	@Override
	public void run() {
		int i = 1;
		while (true) {
			System.out.println(Math.pow(x, i));
			i++;
			}
		

	}
	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			Thread t = new Thread(new Potenze(((int)(Math.random()*5) +2)));
			t.setDaemon(true);
			t.start();
		}

	}
}
