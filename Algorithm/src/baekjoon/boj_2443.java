import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		
		for(int i = 1; i <= star; i++) {
			for(int j = 0; j < 2 * star - i; j++) {
				if(i < j + 2) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}