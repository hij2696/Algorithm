import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String voca = sc.nextLine();
		char[] array_voca = new char[voca.length()];
		int cnt = 0;
		
		for(int i = 0; i < array_voca.length; i++) {
			array_voca[i] = (voca.charAt(i));
			
			if(array_voca[i] == ' ') {
				cnt++;
			}
		}
		if(array_voca[0] == ' ') {
			cnt--;
		}
		if(array_voca[array_voca.length - 1] == ' ') {
			cnt--;
		}
		
		System.out.println(cnt + 1);
		
		sc.close();
	}
}