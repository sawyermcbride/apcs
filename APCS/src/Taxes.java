/**
 * Sawyer McBride
 * Redwood High School
 * APCS Period 2
 * 8/30/16
 * Taxes
 */
import java.text.DecimalFormat;

public class Taxes {
	 final double FED_TAX_RATE = 0.154;
	 final double STATE_TAX_RATE = 0.04;
	 final double FICA_TAX_RATE = 0.0775;
	 
	 private double myHours; 
	 private double myRate; 
	 private double myGrossPay;
	 private double myNetPay;
	 
	 public Taxes(double hours, double wageRate) {
		 myHours = hours;
		 myRate = wageRate;
		 myGrossPay = hours*wageRate;
		 myNetPay = myGrossPay-
		 (FICA_TAX_RATE*myGrossPay)-(STATE_TAX_RATE*myGrossPay)-(FED_TAX_RATE*myGrossPay);
	 }
	 
	 public void DisplayPaycheckInfo() {
		 System.out.println("Hours Worked: " + 
	 formatVal("###,#00.00", myHours));
		 System.out.println("Hourly Rate: " + 
		 formatVal("$###,#00.00", myRate));
		 System.out.println("Gross Pay: " + 
		 formatVal("$###,#00.00", myGrossPay));
		 System.out.println("Federal Tax ("+formatVal("#0.00",FED_TAX_RATE*100)+"%): " +
		 formatVal("$###,#00.00", myGrossPay*FED_TAX_RATE));
		 System.out.println("FICA Tax ("+formatVal("#0.00",FICA_TAX_RATE*100)+"%): " + 
		 formatVal("$###,#00.00", myGrossPay*FICA_TAX_RATE));
		 System.out.println("State Tax ("+formatVal("#0.00",STATE_TAX_RATE*100)+"%): " +
		 formatVal("$###,#00.00", myGrossPay*STATE_TAX_RATE));
		 System.out.println("Net Pay: " + 
		 formatVal("$###,#00.00\n", myNetPay));
	 }
	 private String formatVal (String p, double value) {
		 DecimalFormat d = new DecimalFormat(p);
		 return d.format(value);
	 }
}
