import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        String str = "";

        while (true) {
            int cnt = 0;

            // 문자열 입력받기
            str = sc.nextLine();

            // # 을 입력한 경우
            if (str.charAt(0) == '#') {
                break;
            }

            // 모두 소문자로 변환
            str = str.toLowerCase();

            for (int i=0; i<str.length(); i++) {
                // 모음이 있는 경우
                if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'e' || str.charAt(i) == 'o') {
                    cnt++;
                }
            }

            // 결과 출력
            System.out.println(cnt);
        }

        sc.close();
    }
}
