import java.util.Scanner;

public class Main {
	public static int T, H, W, N;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();
			
			if (N % H == 0) {
				System.out.println((H * 100) + (N / H));
			}
			else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
		}
		
		sc.close();        
	}

}