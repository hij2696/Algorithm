import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A_win = 0;
		int B_win = 0;
		
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A > B) A_win++;
			else if(A < B) B_win++;
		}
		
		System.out.print(A_win + " ");
		System.out.print(B_win);
		
		sc.close();
	}

}
