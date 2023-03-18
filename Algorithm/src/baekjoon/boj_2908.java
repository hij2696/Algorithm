import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int rA, rB;
		
		rA = (A % 10) * 100 + ((A / 10) % 10) * 10 + ((A / 10) / 10);
		rB = (B % 10) * 100 + ((B / 10) % 10) * 10 + ((B / 10) / 10);
		
		if(rA > rB)
			System.out.println(rA);
		else
			System.out.println(rB);
		
	}

}
