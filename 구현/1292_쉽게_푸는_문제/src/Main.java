import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 구간의 시작과 끝 입력 받기
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        int sum = 0; // 숫자 A 부터 숫자 B 까지의 합
        int count = 0; // 구간을 계산하기 위한 카운트

        // 정수는 1부터 1000까지의 수
        for (int i=1; i<=1000; i++) {
            // 수의 크기만큼 반복하여 합산
            for (int j=0; j<i; j++) {
                // 횟수 누적
                count++;

                // 구간 사이의 수일 경우에만 합산
                if (count >= numA && count <= numB) {
                    sum += i;
                }

                // 수가 구간의 끝에 다다르면 반복문 break
                if (count == numB) {
                    break;
                }
            }
        }

        // 합산 결과 출력
        System.out.println(sum);

        sc.close();
    }
}
