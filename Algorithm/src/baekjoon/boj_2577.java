import java.util.Scanner;

public class Main {
	public static final int NUM = 10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		int result = A * B * C;
		int[] numArr = new int[NUM];
        
		while (result > 0) {
			int num = result % 10;
			numArr[num]++;
			result /= 10;
		}
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(numArr[i]);
		}
        
	}

}