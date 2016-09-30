/**
 * Sawyer McBride
 * Redwood High School
 * APCS Period 2
 * 8/30/16
 * Piggy Bank
 */
import java.text.DecimalFormat;

public class PiggyBank {
	private int quarters = 0;
	private int dimes = 0;
	private int nickels= 0;
	private int pennies= 0;
	public PiggyBank () {
	}
	public PiggyBank(int quarters, int dimes, int nickels, int pennies) {
		this.quarters = quarters;
		this.dimes = dimes;
		this.nickels= nickels;
		this.pennies = pennies;
	}
	public void AddCoins(int quarters, int dimes, int nickels, int pennies) {
		this.quarters += quarters;
		this.dimes += dimes;
		this.nickels += nickels;
		this.pennies += pennies;
	}
	public String GetTotalValue() {
		return new DecimalFormat("$0.00").format((quarters*.25)+(dimes*.1)+(nickels*.05)+(pennies*.01));
	}
	public int GetNumQuarters() {
		return quarters;
	}
	public void SetNumQuarters(int numQuarters) {
		quarters = numQuarters;
	}
	public int GetNumDimes() {
		return dimes;
	}
	public void SetNumDimes(int numDimes) {
		dimes = numDimes;
	}
	public int GetNumNickels() {
		return nickels;
	}
	public void SetNumNickels(int numNickels) {
		nickels = numNickels;
	}
	public int GetNumPennies() {
		return pennies;
	}
	public void SetNumPennies(int numPennies) {
		pennies = numPennies;
	}
}
