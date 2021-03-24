import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int cnt_0 = 0; // 연속된 0의 개수
        int cnt_1 = 0; // 연속된 1의 개수

        // 첫번째 숫자가 0인 경우
        if (str.charAt(0) == '0') {
            cnt_0++;
        } else { // 첫번째 숫자가 1인 경우
            cnt_1++;
        }

        // 첫 번째 숫자를 제외한 모든 숫자 비교
        for (int i=1; i<str.length(); i++) {
            // 이전 숫자와 현위치의 숫자가 다른 경우
            if (str.charAt(i-1) != str.charAt(i)) {
                // 현위치 숫자가 0인 경우
                if (str.charAt(i) == '0') {
                    cnt_0++; // 연속된 0의 개수 증가
                } else { // 현위치 숫자가 1인 경우
                    cnt_1++; // 연속된 1의 개수 증가
                }
            }
        }

        // 연속된 0 또는 1의 연속 개수의 최솟값 출력
        System.out.println(Math.min(cnt_0, cnt_1));

        sc.close();
    }
}
