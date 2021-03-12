import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String arr[] = new String[str.length()];

        for (int i=0; i<str.length(); i++) {
            // 문자열 배열에 차례대로 한글자씩 잘라 담는다.
            arr[i] = str.substring(i, str.length());
        }

        // 정렬
        Arrays.sort(arr);

        // 정렬한 순서대로 출력
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}