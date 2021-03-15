/*
 * Task 02 : to demonstrate for synchronized block
 */

package day9.tasks;

class Restaurant {
	public void doAction(int time) {
		for (int i = 0; i < time; i++) {
			System.out.println(Thread.currentThread().getName() + " is ordering food");
		}
		synchronized (this) {
			for (int i = 0; i < time; i++) {
				System.out.println(Thread.currentThread().getName() + " is collecting food");
			}
		}
	}
}

class Action extends Thread {
	Restaurant rest = new Restaurant();

	public void run() {
		rest.doAction(5);
	}
}

public class Task02 {
	public static void main(String[] args) {
		Action action = new Action();

		Thread t1 = new Thread(action);
		t1.setName("John Doe");
		Thread t2 = new Thread(action);
		t2.setName("Sam Smith");
		t2.setPriority(10);
		t1.start();
		t2.start();

	}
}
