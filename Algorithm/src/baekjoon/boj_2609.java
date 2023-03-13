import java.util.Scanner;

public class Main {

	public static int gcd(int x, int y) {
		
		while(y > 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
	
	public static int lcm(int x, int y) {
		
		return (x * y) / gcd(x,  y);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(gcd(num1, num2));
		System.out.println(lcm(num1, num2));
		
		sc.close();
	}
}