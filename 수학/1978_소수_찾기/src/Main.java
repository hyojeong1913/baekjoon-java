import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 입력받을 수의 개수 입력받기
        int cnt = sc.nextInt();

        // 소수인지 판별할 수를 저장할 배열 초기화
        int arr[] = new int[cnt];

        // 소수인지 판별할 수를 입력받아 배열로 저장
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 소수 개수
        int count = 0;

        // 입력받은 배열을 돌며 소수 판별
        for (int i=0; i<arr.length; i++) {
            // 해당 수가 소수인 경우
            if (isPrimeNum(arr[i])) {
                count++; // 카운트 증가
            }
        }

        // 소수 개수 결과 출력
        System.out.println(count);

        sc.close();
    }

    /**
     * 소수인지 판별하는 함수
     * 
     * @param num
     * @return
     */
    static boolean isPrimeNum(int num) {
        // 1은 소수가 아니므로 바로 false 리턴
        if (num == 1) {
            return false;
        }

        // 2부터 수의 제곱근 수까지의 수 중에서 나누어 떨어지는 수가 있는지 확인
        for (int i=2; i<=Math.sqrt(num); i++) {
            // 나누어 떨어지는 수가 있는 경우 소수가 아니므로 바로 false 리턴
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
