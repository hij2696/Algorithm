import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[7];
		int total = 0;
		int min = 100;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i] % 2 != 0) { 
				total += num[i];
				if(min > num[i])
					min = num[i];
			}
		}
		
		if(total == 0)
			System.out.println(-1);
		else {
			System.out.println(total);
			System.out.print(min);
		}
		
		sc.close();
	}
}
