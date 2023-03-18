import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scale = new int[8];
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i = 0; i < scale.length; i++) { 
			scale[i] = sc.nextInt();
		}
		
		for(int i = 0; i < scale.length; i++) {
			if(scale[i] == i + 1) {
				cnt1++;
			}
			if(scale[i] == 8 - i) {
				cnt2++;
			}
		}
		
		if(cnt1 == 8 && scale[0] == 1)
			System.out.println("ascending");
		else if(cnt2 == 8 && scale[0] == 8)
			System.out.println("descending");
		else 
			System.out.println("mixed");
	}
}
