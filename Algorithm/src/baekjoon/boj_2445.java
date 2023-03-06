import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i < N + 1; i++) {
			for(int j = 1; j < 2 * N + 1; j++) {
				if(j <= i) {
					System.out.print("*");
				}
				else if(2 * N <= j + i - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		

		for(int i = N - 1; i > 0; i--) {
			for(int j = 1; j < 2 * N + 1; j++) {
				if(j <= i) {
					System.out.print("*");
				}
				else if(2 * N - i < j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}