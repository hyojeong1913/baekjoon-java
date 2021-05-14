import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 입력받은 문자열의 앞뒤 공백을 제거하기 위해 trim 사용
        String str = sc.nextLine().trim();

        // 공백 단위로 잘라 배열에 단어 담기
        String[] arr = str.split(" ");

        // 빈 문자열인 경우 단어의 개수 0 출력
        if (str.length() == 0) {
            System.out.println(0);
        } else { // 단어 개수 출력
            System.out.println(arr.length);
        }
        
        sc.close();
    }
}
