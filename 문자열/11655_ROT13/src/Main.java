import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i=0; i<str.length(); i++) {

            int tmp = (int) str.charAt(i);

            // 소문자
            if (tmp >= 65 && tmp <= 90) {
                // ROT13 으로 암호화
                tmp += 13;

                // 소문자 'z'를 넘어간 경우
                if (tmp > 90) {
                    tmp -= 26;
                }
            } else if (tmp >= 97 && tmp <= 122) { // 대문자
                // ROT13 으로 암호화
                tmp += 13;

                // 대문자 'Z'를 넘어간 경우
                if (tmp > 122) {
                    tmp -= 26;
                }
            }

            System.out.print((char) tmp);
        }
        
        sc.close();
    }
}