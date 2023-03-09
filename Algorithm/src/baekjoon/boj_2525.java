import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		B += C;
		
		if(B >= 60) {
			while(B >= 60) {
				B -= 60;
				A++;
				if(A >= 24) {
					A = 0;
				}
			}
		}
		
		System.out.print(A % 24 + " " + B);
		
		sc.close();
	}

}
