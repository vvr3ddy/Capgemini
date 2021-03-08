package day4.problem;

class SavingsAccount {
	private int balance;
	private int roi;

	public SavingsAccount(int balance, int roi) {
		super();
		this.balance = balance;
		this.roi = roi;
	}

	public void withdraw(int amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient balance");
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public int addInterest() {
		balance += balance * roi / 100;
		return balance;
	}

}

public class Task2 {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(1000, 4);
		System.out.println("Your balance:"+sa.addInterest());
		sa.deposit(3000);
		System.out.println("Your Balance:"+sa.addInterest());
		sa.withdraw(1000);
		System.out.println("Your Balance:"+sa.addInterest());
	}
}
