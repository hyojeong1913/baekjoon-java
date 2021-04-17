import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        // 입력받은 문자열에서 :을 기준으로 수를 잘라 저장
        int num1 = Integer.parseInt(input.split(":")[0]);
        int num2 = Integer.parseInt(input.split(":")[1]);

        // 두 수 중 더 작은 수 비교
        int min = Math.min(num1, num2);

        // 두 수 중 작은 수부터 차례대로 나누어 탐색
        for (int i=min; i>0; i--) {
            // 두 수 모두 나눠떨어지는 경우
            if (num1 % i == 0 && num2 % i == 0) {
                // 두 수를 나눈 후 break
                num1 /= i;
                num2 /= i;
                break;
            }
        }

        // 결과 출력
        System.out.println(num1 + ":" + num2);

        sc.close();
    }
}
