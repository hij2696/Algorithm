import java.util.Scanner;

public class Main {
	public static int n, x, y, mx, my;
    public static void main(String [] args) {
    	Scanner sc = new Scanner(System.in);

    	int sum = 0;
    	String [] board = new String[4];

        for (int i = 0; i < 4; i++) {
            board[i] = sc.nextLine();
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            	if (board[i].charAt(j) == '.')
            		continue;
            	n = board[i].charAt(j) - 'A';
            	x = n % 4;
            	y = n / 4;
            	mx = Math.abs(x - j);
            	my = Math.abs(y - i);
            	sum += mx + my;
            }
        }
        
        System.out.print(sum);
        
        sc.close();
    }
}