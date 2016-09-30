/**
 * Sawyer McBride
 * Redwood Highschool
 * APCS Period 2
 * 8/25/16
 * Car
 */
public class Car {
	int startMiles = 0;
	int endMiles = 0;
	double gallonsUsed = 0;
	public Car(int odometerReading) {
		startMiles = odometerReading;
		endMiles = odometerReading;			
	}
	public Car() {
	}
	public void fillUp(int miles, double d) {
		endMiles = miles;		
		gallonsUsed = d;
	}
	public double calculateMPG() {
		return (endMiles-startMiles)/gallonsUsed;
	}
	public void resetMPG() {
		startMiles = endMiles;
		gallonsUsed = 0;
	}
	public int getEndMiles() {
		return endMiles;
	}
	public int getStartMiles() {
		return startMiles;
	}
	public double getGallons() {
		return gallonsUsed;
	}
}
