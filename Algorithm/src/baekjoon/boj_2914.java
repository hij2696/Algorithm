import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int I = sc.nextInt();
		int sum = 0;
		
		int song = A * I;
		
		while(A != 1) {
			A--;
			sum++;
		}
		
		System.out.print(song - sum);
		
		sc.close();
	}

}
