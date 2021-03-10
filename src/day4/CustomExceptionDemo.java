package day4;

class CustomException extends Exception {
	public CustomException(String msg) {
		super(msg);
	}
}

class LateException extends RuntimeException {

	public LateException(String msg) {
		super(msg);
	}
}

class Empl {
	public void login(int time) {
		if(time<=9) {
			System.out.println("You are on time");
		}
		else throw new LateException("Marked absent");
	}
}

public class CustomExceptionDemo {
	public static void main(String[] args) throws CustomException {
		Empl e = new Empl();
		e.login(11);
	}
}
