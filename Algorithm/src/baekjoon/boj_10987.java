import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String voca = sc.next();
		char[] arr_vc = new char[voca.length()];
		int cnt = 0;
		
		for(int i = 0; i < arr_vc.length; i++) {
			arr_vc[i] = (voca.charAt(i));
			
			if(arr_vc[i] == 97 || arr_vc[i] == 101 || arr_vc[i] == 105 || arr_vc[i] == 111 || arr_vc[i] == 117)
				cnt++;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}
