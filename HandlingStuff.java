package Main01;

import java.util.Scanner;

class Activity {
	String string1;
	String string2;
	String operator;

	public Activity(String string1, String string2, String operator) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}

}

public class HandlingStuff {
	public String handleException(Activity a) throws Exception{
		try {
			if (a.string1 == null || a.string2 == null) {
				throw new NullPointerException("Null values found");
			}

			else if (!a.operator.equals("+") && !a.operator.equals("-")) {
				throw new Exception(a.operator);
			}else {
				return "No Exception Found";
			}
		} catch (Exception e) {
			return e.getLocalizedMessage();
		}

	}

	public String doOperation(Activity a) {  // Test case MethodCheck fails 
		String res = new String();
		switch (a.operator) {
		case "+":
			res = a.string1 + a.string2;
			break;
		case "-":
			res = a.string1.replace(a.string2, "");
			break;
		}
		return res;
	}

	public static void main(String[] args) throws Exception{
		Activity a = new Activity("a1", "1", "+");
		HandlingStuff s = new HandlingStuff();
		String st = s.handleException(a);
		System.out.println(st);
		System.out.println(s.doOperation(a));
	}
}
