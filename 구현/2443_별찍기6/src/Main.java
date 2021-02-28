import java.util.Scanner;

/**
 * 5
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
public class Main {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
        int count = sc.nextInt();
        
        for (int i=count; i>=1; i--) {

            for (int j=count-i; j>0; j--) {
                System.out.print(" ");
            }

            for (int j=0; j<2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
		sc.close();
	}
}