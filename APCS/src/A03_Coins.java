/*
 * Sawyer McBride
 * Redwood Highschool
 * APCS Period 2
 * 8/22/16
 * Coins
 */
import java.util.Scanner;

public class A03_Coins
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount of change in cents.");
		Coins c = new Coins();
		c.calc(s.nextInt());
	}
}
