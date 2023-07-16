import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] str = new String[T];
		int[] score = new int[T];
		
		for (int i = 0; i < T; i++) {
			str[i] = sc.next();
			int cnt = 0;
			
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'O') {
					cnt++;
					score[i] += cnt;
				}
				else {
					cnt = 0;
				}
			}
			
			System.out.println(score[i]);
		}
		
		sc.close();        
	}

}