import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int fnum = num;
		int cnt = 0;
		
		do {
			num = (num % 10 * 10) + ((num / 10 + num % 10) % 10);
			cnt++;
		} while (num != fnum);
		
		System.out.println(cnt);
		
		sc.close();
	}
}