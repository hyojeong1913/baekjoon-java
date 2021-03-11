import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 로프의 개수
        int num = sc.nextInt();

        int arr[] = new int[num + 1]; // 로프들의 중량 정보가 담길 배열
        int result = 0; // 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량

        // 로프들의 중량 입력받기
        for (int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        // 중량을 기준으로 정렬
        Arrays.sort(arr);

        result = arr[num];

        // 로프 중량 계산
        for (int i=0; i<num; i++) {
            result = Math.max(result, (arr[i] * (num - (i - 1))));
        }

        // 결과 출력
        System.out.println(result);
        
        sc.close();
    }
}