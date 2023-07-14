import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] si = new String[N];
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			si[i] = str.toLowerCase();
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(si[i]);
		}
		
        sc.close();
	}

}