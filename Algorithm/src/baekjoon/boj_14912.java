import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int dgt = sc.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= num; i++) {
			int copy = i;
			while(copy > 0) {
				if(copy % 10 == dgt) {
					cnt ++;
				}
				copy /= 10;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}
