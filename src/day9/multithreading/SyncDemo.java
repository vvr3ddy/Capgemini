package day9.multithreading;

class waterBottle {
	public synchronized void useBottle(int time) {
		for (int i = 1; i <= time; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is using the bottle.");
		}
	}
}

class Drink extends Thread {
	waterBottle wb = new waterBottle();

	@Override
	public void run() {
		wb.useBottle(5);
	}
}

public class SyncDemo {
	public static void main(String[] args) {
		Drink d = new Drink();
		Thread t1 = new Thread(d);
		t1.setName("Mr. A");
		Thread t2 = new Thread(d);
		t2.setName("Ms. B");
		t1.start();
		t2.start();
	}
}
