import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger money = new BigInteger("0");
		BigInteger life = new BigInteger("0");
		
		money = sc.nextBigInteger();
		life = sc.nextBigInteger();
		
		System.out.println(money.divide(life));
		System.out.println(money.remainder(life));
		
		
		sc.close();
	}
}