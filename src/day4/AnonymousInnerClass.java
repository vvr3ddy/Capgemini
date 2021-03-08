package day4;

class Bank2 {
	void roi() {
		System.out.println("ROI:5%");
	}
}


public class AnonymousInnerClass {
	public static void main(String[] args) {
		Bank2 sbi = new Bank2() {
			void roi() {
				System.out.println("ROI:7%");
			}
		}; // this is an anonymous class
		
		sbi.roi();
	}
}
