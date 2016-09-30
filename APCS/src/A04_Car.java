public class A04_Car
{
	public static void main(String[] args)
	{
		Car auto = new Car(15);
		System.out.print("New car odometer reading: ");
		System.out.println(auto.getEndMiles());
		auto.fillUp(150, 8);
		System.out.println("\nMiles per gallon: " + auto.calculateMPG());
		System.out.println("Miles per gallon: " + auto.calculateMPG());
		auto.resetMPG();
		auto.fillUp(350, 10);
		auto.fillUp(450, 20);
		System.out.println("\nMiles per gallon: " + auto.calculateMPG());
		auto.resetMPG();
		auto.fillUp(603, 25.5);
		System.out.println("\nMiles per gallon: " + auto.calculateMPG());
		Car truck = new Car();
		System.out.print("\nNew truck odometer reading: ");
		System.out.println(truck.getEndMiles());
		truck.fillUp(500, 40);
		System.out.println("\nMiles per gallon: " + truck.calculateMPG());
		System.out.println("Starting mileage: " + truck.getStartMiles());
		System.out.println("Ending mileage: " + truck.getEndMiles());
		System.out.println("Gallons used: " + truck.getGallons());
		truck.resetMPG();
		truck.fillUp(875, 48);
		System.out.println("\nMiles per gallon: " + truck.calculateMPG());
		System.out.println("New starting mileage: " + truck.getStartMiles());
		System.out.println("Ending mileage: " + truck.getEndMiles());
		System.out.println("Gallons used: " + truck.getGallons());
	}
}
