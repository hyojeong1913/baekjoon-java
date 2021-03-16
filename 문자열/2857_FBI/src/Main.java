import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String arr[] = new String[5];

        // FBI 요원 수
        int cnt = 0;
    
        // 5명의 첩보원명 입력받기
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i=0; i<arr.length; i++) {
            // 이름에 FBI 가 포함되어 있다면
            if (arr[i].contains("FBI")) {
                // FBI 요원의 번째수 출력
                System.out.print(i + 1 + " ");
                
                // FBI 요원 수 누적 
                cnt++;
            }
        }

        // FBI 요원이 없을 경우
        if (cnt == 0) {
            System.out.println("HE GOT AWAY!");
        }

        sc.close();
    }
}
