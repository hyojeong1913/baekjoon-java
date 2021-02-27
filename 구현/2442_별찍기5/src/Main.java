import java.util.Scanner;

/**
 * 5
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 */
public class Main {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for (int i=1; i<=count; i++) {

			for (int j=0; j<count-i; j++) {
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