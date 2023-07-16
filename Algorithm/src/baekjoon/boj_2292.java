import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	
    	sc.close();
    	
    	int result = 0, i = 1;
    	while (true) {
    		if (N == 1) {
    			result++;
    			break;
    		}
    		
    		N -= (6 * i);
    		i++;
    		result++;
    		
    		if (N < 1) {
    			result++;
    			break;
    		}
    	}
    	
    	System.out.print(result);
    }
}