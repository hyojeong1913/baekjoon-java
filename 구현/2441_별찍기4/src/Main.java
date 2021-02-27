import java.util.Scanner;

/**
 * 5
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for (int i=0; i<input; i++) {
			
			for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
			
			for (int j=input-1; j>=i; j--) {
                System.out.print("*");
            }
			
			System.out.println();
		}
		
		sc.close();
	}
}