/**
 * Sawyer McBride
 * Redwood Highschool
 * AP Computer Science
 * 9/15/16 
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class IRS {
	int maritalStatus = 0;
	double taxableIncome = 0.0;
	Rate[] singleRates = new Rate[5];
	Rate[] marriedRates = new Rate[5];
	Scanner s = new Scanner(System.in);
	DecimalFormat numFormat = new DecimalFormat("$###,##0.00");
	private class Rate {
		int incomeStart = 0, incomeEnd = 0;
		double base = 0, marginal = 0;
		Rate(int incomeStart, int incomeEnd, double base, double marginal) {
			this.incomeEnd = incomeEnd;
			this.incomeStart = incomeStart;
			this.base = base;
			this.marginal = marginal;
		}
	}
	
	public IRS() {
		singleRates[0] = new Rate(0,27050,0,.15);
		singleRates[1] = new Rate(27050,65550,4057.50,.275);
		singleRates[2] = new Rate(65550,136750,14645,.305);
		singleRates[3] = new Rate(136750,297350,36361,.355);
		singleRates[4] = new Rate(297350,1000000000,93374,.391);
		
		marriedRates[0] = new Rate(0,45200,0,.15);
		marriedRates[1] = new Rate(45200,109250,6780,.275);
		marriedRates[2] = new Rate(109250,166500,24393.75,.305);
		marriedRates[3] = new Rate(166500,297350,41855,.355);
		marriedRates[4] = new Rate(297350,1000000000,88306,.391);
	}
	public void GetInfo() {	
		System.out.println("Enter marital status (1=single, 2=married):");
		maritalStatus = s.nextInt();
		System.out.println("Enter taxable income: $");
		taxableIncome = s.nextDouble();
	}
	private double CalcTax() {
		Rate[] arr = (maritalStatus == 1 ? singleRates: marriedRates);
		double amount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(taxableIncome >= arr[i].incomeStart && taxableIncome < arr[i].incomeEnd) {
				amount = arr[i].base+(taxableIncome-arr[i].incomeStart)*arr[i].marginal;
			}
		}
		return amount;
	}

	public void DisplayData() {
		System.out.println("Filing status: " );
		System.out.println("Your Federal tax = " + numFormat.format(CalcTax()));

	}
}
