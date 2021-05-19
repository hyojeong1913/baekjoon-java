import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        char chess[][] = new char[8][8];

        Scanner sc = new Scanner(System.in);

        // 하얀 칸 위에 말이 있는 개수
        int cnt = 0;

        // 체스판 입력받기
        for (int i=0; i<8; i++) {
            // 먼저 한 줄 입력 받기
            String line = sc.next();

            // 입력받은 한 줄을 체스판에 넣기
            for (int j=0; j<line.length(); j++) {
                chess[i][j] = line.charAt(j);
            }
        }

        for (int i=0; i<8; i++) {
            for (int j=0; j<8; j++) {
                // 짝수 행인 경우
                if (i % 2 == 0) {
                    // 짝수 열이면서 말이 있는 경우
                    if (j % 2 == 0 && chess[i][j] == 'F') {
                        cnt++;
                    }
                } else { // 홀수 행인 경우
                    // 홀수 열이면서 말이 있는 경우
                    if (j % 2 == 1 && chess[i][j] == 'F') {
                        cnt++;
                    }
                }
            }
        }

        // 개수 출력
        System.out.println(cnt);

        sc.close();
    }
}
