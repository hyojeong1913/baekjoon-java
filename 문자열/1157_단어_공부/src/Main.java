import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 문자열 입력받기
        String str = sc.nextLine();

        // a ~ z 의 알파벳을 담을 배열
        int alpha[] = new int[26];
        
        // 개수 최댓값
        int max = 0;

        // 결과값 초기화
        char result = '?';

        // 입력받은 문자열 모두 대문자로 변환
        str = str.toUpperCase();

        // 알파벳 개수 세기
        for (int i=0; i<str.length(); i++) {
            alpha[str.charAt(i) - 'A']++;
        }

        for (int i=0; i<alpha.length; i++) {
            // 개수 최댓값 업데이트
            if (max < alpha[i]) {
                max = alpha[i];
                result = (char) (i + 'A');
            } else if (max == alpha[i]) { // 최댓값이 같은 것이 존재하는 경우 '?'로 업데이트
                result = '?';
            }
        }

        // 결과 출력
        System.out.println(result);

        sc.close();
    }
}
