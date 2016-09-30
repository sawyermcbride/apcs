/*
 * Sawyer McBride
 * Redwood Highschool
 * APCS Period 2
 * 8/22/16
 * Coins
 */
public class Coins {
	private int change = 0;
	int[] types =  {25, 10, 5, 1};
	int[] number = new int[4];
	String[] names = {"Quarters", "Dimes", "Nickels", "Pennies"};
	public void calc(int cents) {
		change = cents;
		for(int i = 0; i < types.length;i++) {
			while(change>=types[i]) {
				change-=types[i];
				++number[i];
			}
		}
		for(int i = 0; i < number.length;i++) {
			System.out.println(number[i] + " " + names[i]);
		}
	}
}

