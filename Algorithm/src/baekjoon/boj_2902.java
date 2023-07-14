import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				System.out.print(str.charAt(i));
			}
			else if (str.charAt(i) == 45) {
				System.out.print(str.charAt(i+1));
			}
		}
		
        sc.close();
	}

}