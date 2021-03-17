import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // a ~ z 의 알파벳을 담을 배열
        int alpha[] = new int[26];

        // 가장 많은 알파벳의 개수의 최댓값 초기화
        int max = 0;

        // eof 를 만날 때까지 입력받기
        // hasNextLine() : 행이 있는지 확인 후 줄바뀜이 있는 경우 true 리턴
        while (sc.hasNextLine()) {
            // 입력받은 한 줄
            String str = sc.nextLine();

            // 입력받은 한 줄의 알파벳들을 하나씩 탐색
            for (int i=0; i<str.length(); i++) {
                // 띄어쓰기가 아닌 경우
                if (str.charAt(i) != ' ') {
                    // 해당 알파벳의 개수 1 증가
                    int cnt = ++alpha[(int) (str.charAt(i) - 'a')];
                    
                    // 기존 최댓값과 해당 알파벳의 개수를 비교하여 최댓값 업데이트
                    max = Math.max(max, cnt);
                }
            }
        }

        // 알파벳을 순차적으로 탐색
        for (int i=0; i<alpha.length; i++) {
            // 알파벳의 개수가 최댓값과 같은 경우 알파벳으로 출력
            if (alpha[i] == max) {
                System.out.print((char) (i + 'a'));
            }
        } 

        sc.close();
    }
}
