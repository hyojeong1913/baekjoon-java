import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 문자열 입력받기
        String str = sc.nextLine();

        // 공백을 기준으로 숫자 구분
        String s1 = str.split(" ")[0];
        String s2 = str.split(" ")[1];

        // reverse() 함수를 사용하기 위해 StringBuffer 클래스 사용
        StringBuffer sb1 = new StringBuffer(s1);
        StringBuffer sb2 = new StringBuffer(s2);

        // 숫자 역순으로 업데이트
        s1 = sb1.reverse().toString();
        s2 = sb2.reverse().toString();

        // 역순으로 업데이트한 두 수의 합 구하기
        int s3 = Integer.parseInt(s1) + Integer.parseInt(s2);

        // 결과값 reverse() 함수를 사용하기 위해 StringBuffer 로 초기화
        StringBuffer sb3 = new StringBuffer(Integer.toString(s3));

        // 결과값 역순으로 출력
        System.out.println(Integer.parseInt(sb3.reverse().toString()));

        sc.close();
    }
}
