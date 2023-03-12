import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[9];
		int max = 0;
		int seq = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(max < num[i]) {
				max = num[i];
				seq = i + 1;
			}
		}
		System.out.println(max);
		System.out.print(seq);
		
		sc.close();
	}

}
