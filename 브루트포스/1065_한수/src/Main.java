import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0; // 한수의 개수

        if (num < 100) {
            cnt = num;
        } else {
            cnt = 99; // 최소 99개 이상이므로 기본값을 99로 지정

            // 입력받은 수가 최댓값인 1000일 경우
            if (num == 1000) {
                num = 999; // 1000은 한수가 아니므로 num을 999로 초기화
            }

            for (int i=100; i<=num; i++) {
                int n_100 = i / 100; // 백의 자리
                int n_10 = (i / 10) % 10; // 십의 자리
                int n_1 = i % 10; // 일의 자리

                // 각 자리수가 등차수열을 이루는 경우
                if ((n_100 - n_10) == (n_10 - n_1)) {
                    cnt++; // 한수의 개수 증가
                }
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}