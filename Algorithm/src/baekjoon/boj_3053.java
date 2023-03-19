import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pi = Math.PI;
		int r = sc.nextInt();
		System.out.printf("%.6f\n", (double) r * r * pi);
		System.out.printf("%.6f\n", (double) r * r * 2);
		
		sc.close();
	}

}
