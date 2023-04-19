import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		
		double pi = Math.PI;
		double sinX = Math.sin(pi/3);
		
		double triangle = 0.5 * L * L * sinX;
		
		System.out.println(triangle);
		
		sc.close();
	}

}
