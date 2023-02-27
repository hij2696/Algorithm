import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N < 100) {
			System.out.println(N);
		}
		else {
			int cnt = 99;
			
			for(int i = 100; i <= N; i++) {
				int num1 = (i / 10) / 10;
				int num2 = (i / 10) % 10;
				int num3 = i % 10;
				
				if(num2 * 2 == num1 + num3)
					cnt++;
			}
			System.out.println(cnt);
		}
		
		sc.close();
	}
}