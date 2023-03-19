import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int[] remainder = new int[42];
		int cnt = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			remainder[num[i] % 42]++;
		}
		
		for(int j = 0; j < 42; j++) {
			if((remainder[j] > 0))
				cnt++;
		}
		
		System.out.println(cnt);
			
		sc.close();
	}

}
