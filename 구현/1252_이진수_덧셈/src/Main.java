import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 두 개의 이진수 입력받기
        String str1 = sc.next();
        String str2 = sc.next();

        // 입력받은 두 이진수를 십진수로 변환
        // int 자료형으로는 길이가 80인 이진수는 처리 불가
        // long 타입으로도 연산이 불가능한 큰 정수를 계산하기 위해 BigIntger 클래스 사용
        BigInteger num1 = new BigInteger(str1, 2);
        BigInteger num2 = new BigInteger(str2, 2);

        // 두 수를 합산
        BigInteger sum = num1.add(num2);

        // 합산 결과를 이진수로 변환
        String result = sum.toString(2);

        // 결과 출력
        System.out.println(result);

        sc.close();
    }
}
