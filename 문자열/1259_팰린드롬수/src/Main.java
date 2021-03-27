import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 문자열 입력 받기
            String str = sc.next();

            // 팰린드롬 여부
            boolean flag = true;

            // 0 을 입력한 경우 종료
            if (str.equals("0")) {
                break;
            }

            for (int i=0; i<str.length(); i++) {
                // 앞순서 글자와 뒷순서 글자를 비교하여 다른 경우
                if (str.charAt(i) != str.charAt(str.length() - 1 -i)) {
                    // 팰린드롬 flag false 로 업데이트
                    flag = false;
                }
            }

            // flag 에 따라 결과 출력
            if (flag == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}
