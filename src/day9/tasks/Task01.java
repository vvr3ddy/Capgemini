package day9.tasks;

class Bank {
	public synchronized void doTransaction(int time) {
		for (int i = 0; i < time; i++) {
			System.out.println(Thread.currentThread().getName() + " is under process");
		}
	}
}

class Transaction extends Thread {
	Bank bank = new Bank();

	public void run() {
		bank.doTransaction(5);
	}
}

public class Task01 {
	public static void main(String[] args) {
		Transaction transaction = new Transaction();

		Thread t1 = new Thread(transaction);
		t1.setName("Withdraw");
		Thread t2 = new Thread(transaction);
		t2.setName("Deposit");
		t1.setPriority(10);
		t2.start();
		t1.start();
		
	}
}
