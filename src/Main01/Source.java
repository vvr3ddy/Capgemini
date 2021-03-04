package Main01;

import java.util.*;

public class Source {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float ch = read.nextFloat();
		float pp = read.nextFloat();
		
		List<String> balance = new ArrayList<String>();
		
		if (ch == pp) {
			System.out.println("ZERO");
		} else if (ch > pp) {
			System.out.println("ERROR");
		} else {
			float bal = (float) (Math.round((pp - ch)*100.0)/100.0);
			System.out.println(bal);
			while (bal != 0) {
				if (bal == 100.00) {
					balance.add("ONE HUNDRED");
					bal -= 100.00;
				} else if (bal >= 50.00 && bal <= 100.00) {
					balance.add("FIFTY");
					bal -= 50.00;
				} else if (bal >= 20.00 && bal <= 50.00) {
					balance.add("TWENTY");
					bal -= 20.00;
				} else if (bal >= 10.00 && bal <= 20.00) {
					balance.add("TEN");
					bal -= 10.00;
				} else if (bal >= 5.00 && bal <= 10.00) {
					balance.add("FIVE");
					bal -= 5.00;
				} else if (bal >= 2.00 && bal <= 5.00) {
					balance.add("TWO");
					bal -= 2.00;
				} else if (bal >= 1.00 && bal <= 2.00) {
					balance.add("ONE");
					bal -= 1.00;
				} else if (bal >= 0.50 && bal <= 1.00) {
					balance.add("HALF DOLLAR");
					bal -= 0.50;
				} else if (bal >= 0.25 && bal <= .50) {
					balance.add("QUARTER");
					bal -= 0.25;
				} else if (bal >= 0.10 && bal <= .25) {
					balance.add("DIME");
					bal -= 0.25;
				} else if (bal >= 0.05 && bal <= .10) {
					balance.add("NICKEL");
					bal -= 0.05;
				}else {
					balance.add("PENNY");
					bal -= 0.01;
				}
			}
		}
		Collections.sort(balance);
		for(int i = 0; i<balance.size(); i++) {
			if(i!=balance.size()-1) {
				System.out.print(balance.get(i)+",");
			}System.out.print(balance.get(i));
		}
	}
}