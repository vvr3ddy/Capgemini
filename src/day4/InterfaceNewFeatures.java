package day4;

interface College {
	void dept();

	default void labs() {
		System.out.println("All branches have a lab session");
	}
}

class ETE implements College {

	@Override
	public void dept() {
		System.out.println("This is ETE Department");

	}
	public void labs() {
		
		System.out.println("We do Electronics and Telecom labs");
	}

}

public class InterfaceNewFeatures {
	public static void main(String[] args) {
		ETE e = new ETE();
		e.dept();
		e.labs();
	}
}
