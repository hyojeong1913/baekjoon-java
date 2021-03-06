import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 방 번호 입력받기
        String room_no = sc.nextLine();

        // 9와 6을 함께 처리해주기 위해 9를 6으로 교체
        room_no = room_no.replace('9', '6');

        // 숫자 배열
        // 9를 6과 함께 처리해주기로 하였으므로 0부터 8까지의 9개 숫자 배열
        int arr[] = new int[9];

        int result = 0;

        for (int i=0; i<room_no.length(); i++) {

            // 입력받은 문자열의 각 자리 숫자에 해당하는 배열 값 증가
            arr[(int)(room_no.charAt(i) - 48)]++;
        }

        // 6의 경우 9와 함께 사용하므로 2로 나누고 나머지 더한 후 6의 개수 업데이트
        arr[6] = (arr[6] / 2) + (arr[6] % 2);

        // 숫자 배열을 돌며 최댓값 업데이트
        for (int i=0; i<arr.length; i++) {

            result = Math.max(result, arr[i]);
        }

        // 최댓값 결과 출력
        System.out.println(result);

        sc.close();
    }
}