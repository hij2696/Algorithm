import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int distance, sum = 0;
		
		for(int i = 0; i < 4; i++) {
			distance = sc.nextInt();
			sum += distance;
		}
		
		System.out.print(sum / 60 + "\n" + sum % 60);
		
		sc.close();
	}

}
