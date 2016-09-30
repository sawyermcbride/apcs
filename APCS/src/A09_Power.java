
public class A09_Power {
	static int Power(int base, int num) {
		if(num == 0)
			return 1;
		else
			return base * Power(base, num-1);
	}
	public static void main(String[] args) {
		System.out.println(Power(5,3));
	}
}
