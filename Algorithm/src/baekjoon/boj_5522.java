import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int total = 0;
		
		for(int i = 0; i < 5; i++) {
			score[i] = sc.nextInt();
			total += score[i];
		}
		
		System.out.print(total);
		
		sc.close();
	}

}
