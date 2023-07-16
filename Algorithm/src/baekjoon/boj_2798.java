import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] numbers = new int[N];
		
		for (int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}
		
		sc.close();
		
		int ans = 0;
		
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int tmp = numbers[i] + numbers[j] + numbers[k];
					
					if (M == tmp) {
						ans = tmp;
					}
					
					if (ans <= tmp && tmp <= M) {
						ans = tmp;
					}
				}
			}
		}
		
		System.out.print(ans);
	}

}