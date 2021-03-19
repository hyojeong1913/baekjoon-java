import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 문자열 입력받기
        String str = sc.nextLine();

        // a ~ z 의 알파벳을 담을 배열
        int alpha[] = new int[26];
        
        // 각 배열의 값 모두를 -1 로 초기화
        Arrays.fill(alpha, -1);

        for (int i=0; i<str.length(); i++) {
            // 배열의 값이 -1 인 경우
            if (alpha[str.charAt(i) - 'a'] == -1) {
                // 해당 인덱스 값으로 초기화
                alpha[str.charAt(i) - 'a'] = i;
            }
        }

        // 배열 순차적으로 출력
        for (int a : alpha) {
            System.out.print(a + " ");
        }
        
        sc.close();
    }
}
