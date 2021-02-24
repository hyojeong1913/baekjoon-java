import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        int [] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = y;
		
		for (int i=0; i<x; i++)
			count += arr[i];
		
		switch (count % 7) {
		case 1 :
			System.out.println("MON");
			break;
		case 2 :
			System.out.println("TUE");
			break;
		case 3 :
			System.out.println("WED");
			break;
		case 4 :
			System.out.println("THU");
			break;
		case 5 :
			System.out.println("FRI");
			break;
		case 6 :
			System.out.println("SAT");
			break;
		case 0 :
			System.out.println("SUN");
			break;
		}
			
		sc.close();	
	}
}
