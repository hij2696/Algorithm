import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] str = new String[T];
		
		for (int i = 0; i < T; i++) {
			str[i] = sc.next();
			
			char first = str[i].charAt(0);
			char last = str[i].charAt(str[i].length() - 1);
			
			System.out.println(first + "" + last);
		}
		
        sc.close();
	}

}