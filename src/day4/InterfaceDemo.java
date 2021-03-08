package day4;

interface Bank {
	void rateOfInterest();

	int WORKINGDAYS = 27;

}

interface Loan {
	abstract void creditLimit();
}

class SBI implements Bank, Loan {

	@Override
	public void rateOfInterest() {
		System.out.println("4% of interest");
		System.out.println("Bank working days:" + WORKINGDAYS);
	}

	@Override
	public void creditLimit() {
		System.out.println("upto 30L for Savings Account");
		System.out.println("upto 1Cr for Current Account");
	}

}

public class InterfaceDemo {
	public static void main(String[] args) {
		Bank b = new SBI(); // using this object we can access methods common to Bank and SBI only
		b.rateOfInterest();
//		b.WORKINGDAYS; <-- this is an error, the WORKINGDAYS variable can only be accessed using Bank 
		System.out.println(Bank.WORKINGDAYS);

		SBI s = new SBI(); // using this object we can access all methods inherited by SBI
		s.creditLimit();
	}

}
