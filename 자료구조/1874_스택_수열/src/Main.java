import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 자바에서 지원하는 Stack 클래스 이용
        Stack<Integer> stack = new Stack<Integer>();

        // 입력할 숫자 개수 입력받기
        int n = sc.nextInt();

        // 기준값 초기화
        int tmp = 0;

        for (int i=0; i<n; i++) {
            // 수열을 이룰 정수 입력받기
            int val = sc.nextInt();

            // 오름차순을 위해
            if (val > tmp) {
                // 기준값 tmp 보다 1 큰 수부터 방금 입력받은 정수까지 stack 에 push
                for (int j=tmp+1; j<=val; j++) {
                    stack.push(j);

                    sb.append("+\n"); // 출력 결과물 + 추가
                }

                // 다음 오름차순을 위한 기준값 초기화
                tmp = val;
            } else {
                // 스택의 top 과 입력받은 값이 다른 경우 종료
                if (stack.peek() != val) {
                    System.out.println("NO");
                    return;
                }
            }

            stack.pop();

            sb.append("-\n");
        }

        // 결과 출력
        System.out.println(sb);

        sc.close();
    }
}
