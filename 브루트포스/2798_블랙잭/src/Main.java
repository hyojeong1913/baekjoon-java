import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수 카드 개수 입력받기
        int m = sc.nextInt(); // 블랙잭 최대 합 입력받기

        // 수 카드를 저장할 배열
        int arr[] = new int[n];

        // 수 카드 입력받기
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 블랙잭 합 결과 출력
        System.out.println(getBlackJack(arr, n, m));

        sc.close();
    }

    /**
     * 블랙잭 최대 합 구하기
     * 
     * @param arr 카드 배열
     * @param n 카드 개수
     * @param m 블랙잭 합 최댓값
     * @return
     */
    static int getBlackJack(int[] arr, int n, int m) {
        // 블랙잭 합 초기화
        int max = 0;

        // 첫 번째 카드는 2개를 제외한 n-2 까지만 탐색
        for (int i=0; i<n-2; i++) {
            // 두 번째 카드는 첫 번째 카드 다음부터 1개를 제외한 n-1 까지만 탐색
            for (int j=i+1; j<n-1; j++) {
                // 세 번째 카드는 두 번째 카드 다음부터 끝까지 n 까지만 탐색
                for (int k=j+1; k<n; k++) {
                    // 세 카드의 합
                    int sum = arr[i] + arr[j] + arr[k];

                    // 세 카드의 합이 최대 합 m과 같을 경우
                    if (sum == m) {
                        return sum; // 바로 블랙잭 합 리턴
                    }

                    // 합이 최대합 m 이하인 경우
                    if (sum <= m) {
                        // 기존 블랙잭 합과 비교하여 최댓값으로 업데이트
                        max = Math.max(sum, max);
                    }
                }
            }
        }

        // 블랙잭 합 리턴
        return max;
    }
}
