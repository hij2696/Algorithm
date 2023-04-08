import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] num = new int[N];
		int[] store = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			if(num[i] < X)
				store[i] = num[i];
		}
		
		for(int j = 0; j < N; j++)
			if(store[j] != 0)
				System.out.print(store[j] + " ");
		
		sc.close();
	}

}
