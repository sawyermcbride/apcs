/**
 * Sawyer McBride
 * Redwood High School
 * APCS Period 2
 * 9/15/16
 * CheckPackage
 */
import java.util.Scanner;

public class CheckPackage {
	int[] sides = new int[3];
	int weight = 0;
	int height = 0;
	int width= 0;
	int length = 0;
	
	Scanner s = new Scanner(System.in);
	
	public CheckPackage(){}
	public static void main(String[] args) {
		CheckPackage box = new CheckPackage();
		box.GetPackageInfo();
		box.DisplayResults();
	}
	public void GetPackageInfo() {
		int i = 0;
		while(i<3) {
			System.out.print("\nEnter the side #" + (i+1) + " length in inches:\t");
			sides[i++] = s.nextInt();
		}
		System.out.print("\nEnter the package weight:\t");
		weight = s.nextInt();
	}
	//insertion sort
	private void sortArr(int[] arr) {
		if(arr.length<=1)
			return;
		for(int i = 1; i < arr.length;i++) {
			int elem = arr[i];
			int j = i;
			while(j>0 && elem< arr[j-1]) {
				arr[j] = arr[j-1];
				--j;
			}
			arr[j] = elem;
		}
	}
	private void SetMeasurments() {
		sortArr(sides);
		length = sides[2];
		height = sides[1];
		width = sides[0];
	}
	private String GetMsg() {
		final String[] msgs = {"acceptable", "too heavy", "too large"};
		String rt = "";
		if(((height+width)*2)+length > 100 &&  weight > 70) {
			rt = msgs[1] + " and " + msgs[2];
		}
		else if(((height+width)*2)+length > 100 ) {
			rt=msgs[2];
		}
		else if(weight > 70) {
			rt=msgs[1];
		}
	
		return rt.length()==0 ? msgs[0] : rt;
	}
	public void DisplayResults() {
		SetMeasurments();
		System.out.print("\n\nPackage weight:\t" + weight + " lbs");
		System.out.println("\nPackage length:\t" + length+ " inches");
		System.out.println("Package girth:\t" + ((width+height)*2) + " inches\n");
		System.out.println("The package is " + GetMsg() + ".");	
	}
}
