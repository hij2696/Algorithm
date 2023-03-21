import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double C = sc.nextDouble();
		
		for(int i = 0; i < C; i++) {
			int student = sc.nextInt();
			double[] score = new double[student];
			double total = 0;
			
			for(int j = 0; j < student; j++) {
				score[j] = sc.nextDouble();
				total += score[j];
			}
			
			double average = total / student;
			double cnt = 0;
			
			for(int k = 0; k < student; k++) {
				if(average < score[k]) {
					cnt++;
				}
			}
			
			double up = cnt / student * 100;
			
			System.out.println(String.format("%.3f", up) + "%");
		}
		
	}
}