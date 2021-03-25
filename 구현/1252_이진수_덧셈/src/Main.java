import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 두 개의 이진수 입력받기
        String str1 = sc.next();
        String str2 = sc.next();

        // 입력받은 두 이진수를 십진수로 변환
        int num1 = Integer.parseInt(str1, 2);
        int num2 = Integer.parseInt(str2, 2);

        // 십진수로 변환된 두 수를 더한 후 이진수로 변환
        String result = Integer.toBinaryString(num1 + num2);

        // 결과 출력
        System.out.println(result);

        sc.close();
    }
}
