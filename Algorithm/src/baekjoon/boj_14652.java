import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int n = K / M;
		int m = K % M;
		
		System.out.print(n + " " + m);
		
		sc.close();
	}

}
