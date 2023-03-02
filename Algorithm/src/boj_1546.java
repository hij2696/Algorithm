import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] score = new double[N];
		double total = 0;
		double M = 0;
		
		for(int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
			if(M < score[i])
				M = score[i];
		}
		
		for(int i = 0; i < N; i++) {
			score[i] = (score[i] / M) * 100;
			total += score[i];
		}
		
		System.out.println(total / N);
		
		sc.close();
	}
}