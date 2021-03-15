package day9.multithreading;

class A extends Thread {
	public void run() {

		for (int i = 1; i < 6; i++) {
			System.out.println("A:" + i);
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 10; i <= 20; i++) {
			System.out.println("B:" + i);
		}
	}
}

class C implements Runnable {

	@Override
	public void run() {
		for (int i = 100; i < 110; i++) {
			System.out.println("C:" + i);
		}
	}

}

public class MultitaskingDemo {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		Thread t = new Thread(c);
		a.start();
		b.start();
//		c.run();
		t.start();
	}
}
