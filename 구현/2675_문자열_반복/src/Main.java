import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String result = "";

        int loop = sc.nextInt(); // 입력받을 횟수

        for (int i=0; i<loop; i++) {

            int cnt = sc.nextInt(); // 문자열 반복 횟수
            String str = sc.next(); // 문자열

            for (int j=0; j<str.length(); j++) {

                for (int k=0; k<cnt; k++) {
                    
                    // 입력받은 횟수만큼 입력받은 문자열 각 자리를 반복하여 출력 문자열에 이어붙인다.
                    result += str.charAt(j);
                }
            }

            // 각 결과를 줄 띄어서 보여주기 위해
            result += "\n";
        }

        // 마지막 최종 결과 출력
        System.out.println(result);

        sc.close();
    }
}
