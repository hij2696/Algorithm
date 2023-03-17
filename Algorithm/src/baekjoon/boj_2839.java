import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kg = sc.nextInt();
		int cnt = 0;
		boolean sugar = true;
		
		while(sugar) {
			if(kg % 5 == 0) {
				System.out.println(kg / 5 + cnt);
				break;
			}
			else if(kg <= 0) {
				System.out.println(-1);
				break;
			}
			
			kg -= 3;
			cnt++;
		}
		sc.close();
	}
}