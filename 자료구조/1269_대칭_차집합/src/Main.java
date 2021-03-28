import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    // 중복된 데이터 저장을 허용하지 않는 이진 검색 트리를 이용하기 위해 TreeSet 사용
    static TreeSet<Integer> ts = new TreeSet<>();

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int cntA = sc.nextInt(); // 집합 A 원소의 개수
        int cntB = sc.nextInt(); // 집합 B 원소의 개수

        // 차집합 계산
        getDifferenceSet(cntA);
        getDifferenceSet(cntB);

        // 차집합 결과값 출력
        System.out.println(ts.size());

        sc.close();
    }

    // 차집합 구하기
    static void getDifferenceSet(int size) {
        // 파라미터로 받은 개수만큼
        for (int i=0; i<size; i++) {
            // 수 입력받기
            int tmp = sc.nextInt();

            // 입력되는 값이 TreeSet 내부에 존재하지 않는다면 추가한 뒤 true 반환
            // 이미 존재하는 경우 false 반환
            if (!ts.add(tmp)) { // 이미 존재하는 경우
                ts.remove(tmp); // 차집합에서 원소 제거
            }
        }
    }
}
