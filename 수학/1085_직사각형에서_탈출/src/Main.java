import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minX = Math.min(x, x - w); // x축의 최소 거리
        int minY = Math.min(y, y - h); // y축의 최소 거리

        System.out.println(Math.min(minX, minY));

        sc.close();
    }
}
