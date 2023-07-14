import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		if(N % 2 != 0){
			for(int i = 0; i < N; i++){
				System.out.print("*");
			}
			System.out.println();

			for(int i = 0; i < N / 2 + 1; i++){
				for(int k = 0; k < N / 2 + i + 1; k++){
					if(k == N / 2 + i){
						System.out.print("*");
					}
					else if(k == N / 2 - i){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
			}
			System.out.println();
			}
		}
		else System.out.print("I LOVE CBNU\n");
		
        scanner.close();
	}

}