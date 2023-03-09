import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i >= j) {
					System.out.print("*");
				}
				else {
					break;
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = 0; j < N; j++) {
				if(N - j - 1 > i) {
					System.out.print("*");
				}
				else {
					break;
				}
			}
			System.out.println();
		}
		sc.close();
	}
}