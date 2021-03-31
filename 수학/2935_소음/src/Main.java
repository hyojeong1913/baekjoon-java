import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 두 수와 연산자 입력 받기
        // 거대 무한 정수이므로 BigInteger 사용
        BigInteger numA = new BigInteger(sc.nextLine());
        String op = sc.nextLine();
        BigInteger numB = new BigInteger(sc.nextLine());
        
        // 연산자가 * 인 경우
        if (op.equals("*")) {
            System.out.println(numA.multiply(numB)); // BigInteger 에서 제공하는 multiply() 사용하여 계산 후 결과 출력
        } else if (op.equals("+")) { // 연산자가 + 인 경우
            System.out.println(numA.add(numB)); // BigInteger 에서 제공하는 add() 사용하여 계산 후 결과 출력
        }

        sc.close();
    }
}
