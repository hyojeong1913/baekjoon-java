import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 명령 입력받을 개수 입력받기
        int cnt = sc.nextInt();

        // 자바에서 지원하는 Stack 클래스 이용
        Stack<Integer> stack = new Stack<Integer>();

        // 0.5초라는 시간 제한이 있었는데 매 명령마다 sysout 으로 결과 출력하였더니 시간 초과되어 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<cnt; i++) {
            // 명령 입력받기
            String cmd = sc.next();

            switch (cmd) {
                case "push": // push X : 정수 X를 스택에 넣는 연산
                    int input = sc.nextInt();
                    stack.push(input);
                break;
                case "pop": // pop : 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); // 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
                break;
                case "size": // size : 스택에 들어있는 정수의 개수를 출력
                    sb.append(stack.size()).append("\n");
                break;
                case "empty": // empty : 스택이 비어있으면 1, 아니면 0을 출력
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                break;
                case "top": // top : 스택의 가장 위에 있는 정수를 출력
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); // 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
                break;
            }
        }

        System.out.println(sb);

        sc.close();
    }
}
