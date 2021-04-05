import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 정수 입력 받기
        int num = sc.nextInt();

        // 재귀 결과 출력
        System.out.println(recur(num, 0));

        sc.close();
    }

    /**
     * 재귀 호출로 해결
     * 
     * @param n
     * @param cnt
     * @return
     */
    static int recur(int n, int cnt) {
        // n이 1이 되면 횟수 cnt 리턴
        if (n < 2) {
            return cnt;
        } else {
            // 재귀를 호출하면서 횟수를 누적시켜 n이 결국 1이 되면 횟수 cnt 반환
            return Math.min(recur(n / 3, cnt + 1 + (n % 3)), recur(n / 2, cnt + 1 +(n % 2)));
        }
    }
}
