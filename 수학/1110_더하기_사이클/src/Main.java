import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0; // 사이클 횟수
        int tmp = num; // 값을 비교하기 위해 원수를 저장

        while (true) {
            cnt++; // 횟수 누적
            
            int num_10 = num / 10; // 수의 십의 자리
            int num_1 = num % 10; // 수의 일의 자리
            
            num = (num_1 * 10) + ((num_10 + num_1) % 10); // 규칙대로 만들어진 수로 num 업데이트

            // 입력받은 원수와 새로운 수 비교하여 같은 경우 반복문을 빠져나간다.
            if (num == tmp) {
                break;
            }
        }

        // 결과 출력
        System.out.println(cnt);
        
        sc.close();
    }
}