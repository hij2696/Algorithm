import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long total = sc.nextLong();
		int sum = 0;

		for(int i = 1; i <= total; i++) {
			total -= i;
			sum++;
		}
		
		System.out.println(sum);
			
		sc.close();
	}

}