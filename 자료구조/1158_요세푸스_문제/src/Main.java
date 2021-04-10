import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 사람 수
        int k = sc.nextInt(); // 제거할 번째 수

        // 자바에서 지원하는 Queue 클래스 이용
        Queue<Integer> queue = new LinkedList<Integer>();

        // 입력받은 n까지의 수를 큐에 담기
        for (int i=1; i<=n; i++) {
            queue.offer(i);
        }

        // < 로 초기화하여 StringBuilder 생성
        StringBuilder sb = new StringBuilder("<");

        // 큐가 빌 때까지
        while (!queue.isEmpty()) {
            // 번째 수까지 돌면서 확인
            for (int i=1; i<=k; i++) {
                // 번째 수인 경우
                if (i == k) {
                    sb.append(queue.poll()).append(", "); // 해당 수를 빼서 출력에 담기
                } else { // 번째 수가 아닌 경우
                    queue.offer(queue.poll()); // 해당 수를 빼서 다시 맨 뒤로 보내기
                }
            }
        }

        // 결과 출력을 위해 맨 뒤에 있는 , 를 지운 뒤 마지막 괄호 추가
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");

        // 결과 출력
        System.out.println(sb);

        sc.close();
    }
}
