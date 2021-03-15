import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 입력받을 수를 저장할 스택
        Stack<Integer> stack = new Stack<Integer>();

        int result = 0;
        int cnt = sc.nextInt();

        for (int i=0; i<cnt; i++) {
            int num = sc.nextInt();

            // 0일 경우 스택에 방금 저장된 수 pop
            if (num == 0) {
                stack.pop();
            } else { // 0이 아닌 경우 스택에 저장
                stack.push(num);
            }
        }

        // 스택에 있는 수들의 합 구하기
        for (int s : stack) {
            result += s;
        }

        // 결과 출력
        System.out.println(result);
        
        sc.close();
    }
}