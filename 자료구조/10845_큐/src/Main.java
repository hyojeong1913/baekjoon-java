import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 명령 입력받을 개수 입력받기
        int cnt = sc.nextInt();
        int last = 0;

        // 자바에서 지원하는 Queue 클래스 이용
        Queue<Integer> queue = new LinkedList<Integer>();

        // 0.5초라는 시간 제한이 있었는데 매 명령마다 sysout 으로 결과 출력하였더니 시간 초과되어 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<cnt; i++) {
            // 명령 입력받기
            String cmd = sc.next();

            switch (cmd) {
                case "push": // push X : 정수 X를 큐에 넣는 연산
                    int input = sc.nextInt();
                    queue.add(input);

                    // back 명령에 사용할 큐의 가장 뒤에 있는 변수 업데이트
                    last = input;
                break;
                case "pop": // pop : 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력
                    sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n"); // 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
                break;
                case "size": // size : 큐에 들어있는 정수의 개수를 출력
                    sb.append(queue.size()).append("\n");
                break;
                case "empty": // empty : 큐가 비어있으면 1, 아니면 0을 출력
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                break;
                case "front": // front : 큐의 가장 앞에 있는 정수를 출력
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n"); // 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
                break;
                case "back": // back : 큐의 가장 뒤에 있는 정수를 출력
                    sb.append(queue.isEmpty() ? -1 : last).append("\n"); // 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
                break;
            }
        }

        // 결과 출력
        System.out.println(sb);

        sc.close();
    }
}
