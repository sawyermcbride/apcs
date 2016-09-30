/**
 * Sawyer McBride
 * Redwood Highschool
 * Period 2
 * APCS
 * 9/6/16
 */
import java.text.DecimalFormat;

import java.util.Scanner;

public class A07_GroceryList {
	static double[] arr = new double[5];
	static Scanner s = new Scanner(System.in);
	static double total  = 0;
	private static void getInput() {
		int i = 0;
		double totalPrice = 0;
		while(i<arr.length) {
			System.out.print("\nItem #"+(i+1)+": ");
			arr[i++] = s.nextDouble();
		}
	}
	private static void showInput() {
		System.out.println("ITEM\tCOST\tTOTAL");
		DecimalFormat d = new DecimalFormat("$###,##0.00");
		System.out.println("----\t----\t-----");
		for(int i = 0; i < arr.length;i++) {
			total+=arr[i];
			System.out.printf(" #%d%9s%9s\n", (i+1), d.format(arr[i]), d.format(total));
		}	
	}
	public static void main(String args[]) {
		getInput();
		showInput();
	}
}
