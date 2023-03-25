import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] MK = new int[4];
		int[] MS = new int[4];
		int sumK = 0;
		int sumS = 0;
		
		for(int i = 0; i < MK.length; i++) {
			MK[i] = sc.nextInt();
			sumK += MK[i];
		}
		for(int i = 0; i < MS.length; i++) {
			MS[i] = sc.nextInt();
			sumS += MS[i];
		}
		
		if(sumK > sumS) System.out.println(sumK);
		else if(sumK < sumS) System.out.println(sumS);
		else if(sumK == sumS) System.out.println(sumK);
		
		sc.close();
	}

}
