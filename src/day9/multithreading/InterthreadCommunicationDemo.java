package day9.multithreading;

class Account {
	int balance = 5000;

	synchronized void withdraw(int amount) {
		System.out.println("Attempting to withdraw.");
		if (balance < amount) {
			System.out.println("insufficient fund.. Please deposit money..");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Withdraw complete.");
	}

	synchronized void deposit(int amount) {
		System.out.println("Attempting to deposit.");
		balance += amount;
		notify();  // comment the code and observe output to understand how logic changes
		System.out.println("Deposit complete.");
	}

}

public class InterthreadCommunicationDemo {
	public static void main(String[] args) {
		Account account = new Account();
		Thread withdraw = new Thread() {
			public void run() {
				account.withdraw(7000);
			}
		};
		withdraw.setName("Withdraw");
		withdraw.start();
		Thread deposit = new Thread() {
			public void run() {
				account.deposit(7000);
			}
		};
		deposit.setName("Deposit");
		deposit.start();
	}
}
