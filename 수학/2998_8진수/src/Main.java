import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 2진수 입력받기
        String num_2 = sc.next();

        // 입력받은 2진수를 10진수로 변환
        // int 자료형으로는 길이가 100인 2진수는 처리 불가
        // long 타입으로도 연산이 불가능한 큰 정수를 계산하기 위해 BigIntger 클래스 사용
        BigInteger num_10 = new BigInteger(num_2, 2);
       
        // 10진수를 8진수로 변환
        String num_8 = num_10.toString(8);

        // 결과 출력
        System.out.println(num_8);       
        
        sc.close();
    }
}
