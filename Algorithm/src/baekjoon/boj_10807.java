import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] digit = new int[N];
		
		for(int i = 0; i < N; i++)
			digit[i] = sc.nextInt();
		
		int v = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			if(digit[i] == v)
				cnt++;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}