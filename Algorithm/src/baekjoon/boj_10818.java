import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] score = new int[N];
		int min = 1000000;
		int max = -1000000;
		
		for(int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
			if(min > score[i]) {
				min = score[i];
			}
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		System.out.print(min + " ");
		System.out.print(max);
		
		sc.close();
	}

}
