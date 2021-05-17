import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 알파벳 소문자로만 이루어진 단어 입력 받기
        String word = sc.nextLine();

        // 알파벳 배열
        int alpha[] = new int[26];

        for (int i=0; i<word.length(); i++) {
            // 해당 알파벳 개수 증가
            alpha[word.charAt(i) - 'a']++; 
        }

        // 결과 출력
        for (int i=0; i<alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }

        sc.close();
    }
}
