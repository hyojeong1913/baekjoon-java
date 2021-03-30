import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // 8개의 음을 담을 배열
        int arr[] = new int[8];

        // 음 입력받기
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        String result = "";

        for (int i=0; i<arr.length-1; i++) {
            // 뒤 숫자가 앞 숫자보다 1 큰 경우
            if (arr[i+1] - arr[i] == 1) {
                result = "ascending";
            } else if (arr[i+1] - arr[i] == -1) { // 뒤 숫자가 앞 숫자보다 1 작은 경우
                result = "descending";
            } else { // 앞뒤 숫자 차이가 1이 아닌 경우
                result = "mixed";
                break; // 하나라도 앞뒤 숫자 차이가 1이 아닌 경우 반복문 빠져나가기
            }
        }

        System.out.println(result);

        sc.close();
    }
}
