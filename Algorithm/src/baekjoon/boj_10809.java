import java.util.Scanner;

public class Main {
	public static final int ALPHABET = 26;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		sc.close();
		
		int[] location = new int[ALPHABET];
		
		for (int i = 0; i < location.length; i++) {
			location[i] = -1;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (location[s.charAt(i) - 'a'] == -1)
				location[s.charAt(i) - 'a'] = i;
		}
		
		for (int i = 0; i < ALPHABET; i++) {
			System.out.print(location[i] + " ");
		}
		        
	}

}