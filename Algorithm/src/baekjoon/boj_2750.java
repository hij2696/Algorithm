import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		int[] num = new int[1000];
		
		for(int i = 0; i < line; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < line - 1; i++) {
			for(int j = i + 1; j < line; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < line; i++) {
			System.out.println(num[i]);
		}
		
		sc.close();
	}

}