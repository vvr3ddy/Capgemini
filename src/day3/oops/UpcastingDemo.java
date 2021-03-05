package day3.oops;

class Account {
	void minBalance() {
		System.out.println("1000");
	}
}

class SavingsAccount extends Account {
	void minBalance() {
		System.out.println("10000");
	}
}

class CurrentAccount extends Account {
	void minBalance() {
		System.out.println("25000");
	}
}

public class UpcastingDemo {
	public static void main(String[] args) {
		Account account = new CurrentAccount();
		account.minBalance();
	}
}
