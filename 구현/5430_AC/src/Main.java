import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 테스트케이스 개수
        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            // 수행할 함수 입력받기
            String cmd = sc.next();

            // 배열에 수를 넣을 개수와 들어갈 수 배열을 문자열로 입력받기
            int cnt = sc.nextInt();
            String input = sc.next();

            // 양쪽 괄호 빼기
            input = input.substring(1, input.length() - 1);

            // 자유자재로 뒤집기, 삭제를 하기 위해 큐의 양쪽 끝에서 삽입과 삭제가 가능한 deque 사용
            Deque<Integer> deque = new LinkedList<>();

            // , 를 기준으로 잘라 배열로 만든 뒤 탐색
            for (String str : input.split(",")) {
                // 숫자를 deque 에 넣기
                if (!str.equals("")) {
                    deque.add(Integer.valueOf(str));
                }
            }

            // 결과 출력
            System.out.println(ac(deque, cmd));
        }

        sc.close();
    }

    /**
     * 함수 수행
     * 
     * @param deque
     * @param cmdStr
     * @return
     */
    static String ac(Deque<Integer> deque, String cmdStr) {
        
        StringBuilder sb = new StringBuilder("[");

        // 뒤집을지에 대한 여부
        boolean doReverse = false;

        for (char cmd : cmdStr.toCharArray()) {
            // R인 경우
            if (cmd == 'R') {
                doReverse = !doReverse; // 뒤집을지 여부 업데이트
            } else if (cmd == 'D') { // D인 경우
                // 비어있는데 삭제를 요청한 경우 에러 리턴
                if (deque.size() == 0) {
                    return "error";
                }

                // 뒤집어야하는 경우
                if (doReverse) {
                    deque.removeLast();
                } else {
                    deque.removeFirst();
                }
            } else {

            }
        }

        while (!deque.isEmpty()) {
            if (doReverse) {
                sb.append(deque.removeLast());
            } else {
                sb.append(deque.removeFirst());
            }

            if (deque.size() != 0) {
                sb.append(",");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
