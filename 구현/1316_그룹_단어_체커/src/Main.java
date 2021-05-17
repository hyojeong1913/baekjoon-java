import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 단어 개수
        int num = sc.nextInt();

        // 체커 개수
        int cnt = num;

        for (int i=0; i<num; i++) {
            // 단어 입력
            String str = sc.next();

            // 체커 배열
            boolean checker[] = new boolean[26];

            for (int j=1; j<str.length(); j++) {
                // 현재 문자와 이전 문자가 다른 경우
                if (str.charAt(j - 1) != str.charAt(j)) {
                    // 현재 문자가 이전에 이미 나온 문자인 경우
                    if (checker[str.charAt(j) - 97] == true) {
                        // 체커 단어가 아니므로 개수 1 감소
                        cnt--;
                        break;
                    }

                    // 등장한 문자는 true 로 변경
                    checker[str.charAt(j - 1) - 97] = true;
                }
            }
        }

        // 체커 단어 개수 결과 출력
        System.out.println(cnt);

        sc.close();
    }
}
