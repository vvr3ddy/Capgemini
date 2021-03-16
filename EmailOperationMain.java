package Main01;

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import java.text.*;

class Header {
	String from;
	String to;

	public Header(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}

}

class Email {
	Header header;
	String body;
	String greetings;

	public Email(Header header, String body, String greetings) {
		super();
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
}

class EmailOperations {

	public int verifyEmail(Email e) {
		String pattern = "^(\\_|[a-z])+@{1}[\\w]+.[a-zA-Z]+$";
		Pattern p = Pattern.compile(pattern);
		Matcher m1 = p.matcher(e.header.from);
		Matcher m2 = p.matcher(e.header.to);
		if (m1.matches() && m2.matches())
			return 2;
		else if (m1.matches() || m2.matches())
			return 1;
		else
			return 0;
	}

	public static String bodyEncryption(Email e) {
		StringBuffer result = new StringBuffer();
		int s = 3;
		String text = e.body;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i))) {
				char ch = (char) (text.charAt(i));
				result.append(ch);
			} else if (Character.isUpperCase(text.charAt(i))) {
				char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
				result.append(ch);
			} else {
				char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result.toString();
	}

	public static String greetingMessage(Email e) {
		String greet = e.greetings;
		String sender = e.header.from;
		String name = sender.split("@")[0];
		String res = greet + " " + name;
		return res;
	}

}

public class EmailOperationMain {

}
