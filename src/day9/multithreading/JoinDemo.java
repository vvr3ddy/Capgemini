package day9.multithreading;

class A2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

class B2 extends Thread {
	public void run() {
		for (int i = 10; i <= 15; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

class C2 extends Thread {
	public void run() {
		for (int i = 100; i <= 105; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Name of main method thread:" + Thread.currentThread().getName());
		A2 a = new A2();
		a.setName("Thread A");
		B2 b = new B2();
		b.setName("Thread B");
		C2 c = new C2();
		c.setName("Thread C");
		b.setPriority(9);
		c.setPriority(7);
		a.start();
		b.start();
		c.start();
		b.join();
		c.join();

	}
}
