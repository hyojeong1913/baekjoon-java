import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        String arr[] = new String[count];

        // 입력받은 횟수만큼 문자열 입력받기
        for (int i=0; i<count; i++) {

            arr[i] = sc.next();
        }

        for (int i=0; i<arr.length; i++) {

            int tmp = 0; // 연속된 O 의 개수
            int result = 0; // 누적 결과

            for (int j=0; j<arr[i].length(); j++) {

                // O 인 경우
                if (arr[i].charAt(j) == 'O') {
                    tmp++; // 개수 1 누적
                } else { // X 인 경우
                    tmp = 0; // 개수 초기화
                }

                result += tmp;
            }

            // 결과 출력
            System.out.println(result);
        }

        sc.close();
    }
}
