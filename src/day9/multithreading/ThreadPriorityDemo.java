package day9.multithreading;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 1; i<10; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 1; i<10; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		};
		
		t2.setPriority(10);
		t1.start();
		t2.start();

	}

}
