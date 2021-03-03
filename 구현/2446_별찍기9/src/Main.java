import java.util.Scanner;

/**
 * 5
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Main {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
        int count = sc.nextInt();
        
        // 상단 1 ~ 5행
        for (int i=0; i<count; i++) {

            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }

            for (int j=0; j<=2*(count-i-1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 하단 6 ~ 9행
        for (int i=1; i<count; i++) {

            for (int j=i+1; j<count; j++) {
                System.out.print(" ");
            }

            for (int j=0; j<=2*i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
		sc.close();
	}
}