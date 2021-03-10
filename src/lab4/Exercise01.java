package lab4;

import java.util.*;

class Person {
	String name;
	float age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
}

class Account {
	long accNum;
	double balance;
	Person accHolder;

	void deposit(double amount) {
		balance += amount;
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	double getBalance() {
		return balance;
	}
}

class SavingsAccount extends Account {
	final double minBalance = 500;

	@Override
	void withdraw(double amount) {
		if (balance > minBalance) {
			if (amount < balance) {
				balance -= amount;
			} else {
				System.out.println("Withdrawl ammount exceeds balance.");
			}
		} else {
			System.out.println("Insufficient funds.");
		}
	}
}

class CurrentAccount extends Account {
	double overdraftLimit;
	@Override
	void withdraw(double amount) {
		if(amount > overdraftLimit) {
			System.out.println(false);
		}else {
			System.out.println(true);
			
		}
	}
}

public class Exercise01 {
	public static void main(String[] args) {
		Random rd = new Random();

		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Smith");
		Account a1 = new Account();
		a1.setAccHolder(p1);
		a1.setBalance(2000);
		a1.setAccNum(((long) (Math.random() * (Long.MAX_VALUE - 0)) + 0));

		Person p2 = new Person();
		p2.setAge(20);
		p2.setName("Kathy");
		Account a2 = new Account();
		a2.setAccHolder(p2);
		a2.setBalance(3000);
		a2.setAccNum(((long) (Math.random() * (Long.MAX_VALUE - 0)) + 0));

		a1.deposit(2000);
		a2.withdraw(2000);
		System.out.println("Kathy's Bank Details:");
		System.out.println("Account Num:" + a2.getAccNum());
		System.out.println("Balance:" + a2.getBalance());

		System.out.println("Smith's Bank Details:");
		System.out.println("Account Num:" + a1.getAccNum());
		System.out.println("Balance:" + a1.getBalance());

	}
}
