import java.util.Scanner;
public class A08_IRS
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	IRS tax = new IRS();
	String again = "";
do
{
	tax.GetInfo();
	tax.DisplayData();
	System.out.print("\nCalculate tax for someone else (y/n)? ");
	again = input.nextLine();
} while (again.toLowerCase().equals("y"));
	input.close();
	}
}
