package day9.multithreading;

class A1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

class B1 extends Thread {
	public void run() {
		for (int i = 10; i <= 15; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

public class SetThreadNameDemo {
	public static void main(String[] args) {
		System.out.println("Name of main method thread:" + Thread.currentThread().getName());
		A1 a = new A1();
		a.setName("Thread A");
		B1 b = new B1();
		b.setName("Thread B");
		a.start();
		b.start();
	}
}
