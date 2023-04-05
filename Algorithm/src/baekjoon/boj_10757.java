import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("0");
		BigInteger sum = new BigInteger("0");
		
		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		
		sum = sum.add(a);
		sum = sum.add(b);
		
		System.out.println(sum);
	}
}
