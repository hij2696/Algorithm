import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int num1, num2;
		for(int i = 0; i < T; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}
		
		sc.close();
	}

}
