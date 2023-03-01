import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int[] cnt = new int[input + 1];
		
		cnt[0] = cnt[1] = 0;
		
		for(int i = 2; i <= input; i++) {
			cnt[i] = cnt[i - 1] + 1;
			if(i % 2 == 0)
				cnt[i] = Math.min(cnt[i], cnt[i / 2] + 1);
			if(i % 3 == 0)
				cnt[i] = Math.min(cnt[i], cnt[i / 3] + 1);
		}
		
		System.out.println(cnt[input]);
		
		sc.close();
	}
}