import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int num[] = new int[cnt];

        // 정수 수열 입력받아서 배열로 저장
        for (int i=0; i<num.length; i++) {
            num[i] = sc.nextInt();
        }

        // 최댓값 첫번째 정수로 초기화
        int max = num[0];
        int sum = 0;

        for (int i=0; i<num.length; i++) {
            // 다음 차례 수 합산
            sum += num[i];

            // 기존 최댓값과 합계 비교하여 최댓값 업데이트
            max = Math.max(max, sum);

            // 연속된 수의 합이 음수면 다음 차례보다는 무조건 작으므로 0으로 합계 초기화
            if (sum < 0) {
                sum = 0;
            }
        }

        // 최댓값 결과 출력
        System.out.println(max);
        
        sc.close();
    }
}
