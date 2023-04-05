import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		if((A >= B && B >= C) || (C >= B && B >= A))
			System.out.println(B);
		else if((B >= C && C >= A) || (A >= C && C >= B))
			System.out.println(C);
		else if((C >= A && A >= B) || (B >= A && A >= C))
			System.out.println(A);
		
	}

}
