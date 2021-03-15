package day9.multithreading;

public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		// Anonymous classes

		// the .class file wont be created for these classes
		Thread A = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					if (i % 3 != 0)
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					System.out.println("A:" + i);
				}
			}
		};

		Runnable B = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						if (i == 4)
							Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("B:" + i);
				}
			}
		};

		A.start();
		Thread t = new Thread(B);
		t.start();
	}
}
