import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) - 3 < 'A') {
				System.out.print((char)(str.charAt(i) + 23));
			}
			else {
				System.out.print((char)(str.charAt(i) - 3));
			}
		}
		
        sc.close();
	}

}