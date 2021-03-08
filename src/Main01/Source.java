package Main01;

import java.util.*;

public class Source {

	public static float calculateItemPrice(float itemPrice, int Quantity) {
		return itemPrice * Quantity;
	}

	public static void main(String[] args) throws InvalidInputException {
		Scanner read = new Scanner(System.in);
		ArrayList<String> itemName = new ArrayList<String>();
		ArrayList<String> itemType = new ArrayList<String>();
		ArrayList<Float> itemPrice = new ArrayList<Float>();
		ArrayList<Integer> quantity = new ArrayList<Integer>();
		String iName;
		String iType;
		Float iPrice;
		Float tax;
		Integer iQty;
		try {

			char ch = 'y';
			// read product details
			do {
				System.out.println("Enter item Name:");
				iName = read.nextLine();
				itemName.add(iName);
				System.out.println("Enter item Type:");
				iType = read.nextLine();
				itemType.add(iType);
				System.out.println("Enter item Price:");
				iPrice = read.nextFloat();
				itemPrice.add(iPrice);
				System.out.println("Enter item Quantity:");
				iQty = read.nextInt();
				quantity.add(iQty);
				read.nextLine();
				System.out.println("Do you want to enter details of any other item(y/n):");
				ch = read.nextLine().charAt(0);
				System.out.println("Choice:" + ch);
				if (iType == null || iType == null || iQty == null || iQty == null) {
					throw new InvalidInputException("Null Value entered");
				}

			} while (ch == 'y');

			System.out.println("Your Bill");
			System.out.println();
			System.out.printf("%-20s %-10s %-10s %-15s %n", "itemType", "titemName", "Qty", "Price per unit",
					"Total Price");
			Float totalPrice;
			Float subTotal = 0.0f;
			for (int i = 0; i < itemType.size(); i++) {
				totalPrice = itemPrice.get(i) * quantity.get(i);
				subTotal += totalPrice;
				System.out.printf("%-20s %-10s %-10s %-15s %n", itemType.get(i), itemName.get(i), quantity.get(i),
						itemPrice.get(i), totalPrice);
				System.out.println();
			}
			Float salesTax = subTotal * 0.125f;
			System.out.printf("%-20s %-10s %-10s %-15s %n", "", "", "SubTotal:", subTotal);
			System.out.printf("%-20s %-10s %-10s %-15s %n", "", "", "TotalTotal:", (subTotal + salesTax));

		} catch (InvalidInputException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class InvalidInputException extends Exception {
	InvalidInputException(String msg) {
		super();
		System.out.println(msg);
	}
}