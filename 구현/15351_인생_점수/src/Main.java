import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 즐기는 것의 개수 N 입력 받기
        int num = sc.nextInt();

        // 즐기는 것의 이름 배열 초기화
        String str[] = new String[num];

        // nextInt() 의 경우 엔터키를 누르기 바로 전까지의 숫자만 입력받는다.
        // 이후 nextLine() 을 사용하는 경우 개행문자까지 입력받아 제대로 입력받지 못한다.
        // nextLine() 으로 방금 입력한 개행문자를 강제 소거하여 오류를 해결한다.
        sc.nextLine();

        // 개수만큼 문자열 입력받기
        for (int i=0; i<num; i++) {
            str[i] = sc.nextLine();
        }

        for (int i=0; i<str.length; i++) {
            
            // 인생 점수 초기화
            int sum = 0;

            // 각 문자마다 점수 매기기
            for (int j=0; j<str[i].length(); j++) {
                
                // 띄어쓰기가 아닌 경우에만
                if (str[i].charAt(j) != ' ') {

                    // 'A' 를 빼고 1을 더해 점수 계산 합 누적
                    sum += (str[i].charAt(j) - 'A' + 1);
                }
            }

            if (sum == 100) {
                System.out.println("PERFECT LIFE");
            } else {
                // 누적 점수 출력
                System.out.println(sum);
            }
        }

        sc.close();
    }
}
