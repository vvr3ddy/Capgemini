package day8;

class Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("This is my task");
	}

}

class Demo2 extends Thread {
	public void run() {
		System.out.println("This is another task");
	}
}

public class MultithreadingDemo {
	public static void main(String[] args) {
		Demo2 t2 = new Demo2();
		Demo t1 = new Demo();
//		t2.run();
//		t1.run();

		// Using run method is of no use because it doesn't lead to multithreading, but is rather sequential

		// In order to achieve multithreading we make use of start() method
	}
}
