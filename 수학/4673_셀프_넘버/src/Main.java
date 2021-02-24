public class Main {

    public static void main(String[] args) {

        boolean[] arr = new boolean[10001];

        for (int i=1; i<arr.length; i++) {
            int selfNum = getSelfNum(i);
            
            if (selfNum < arr.length) {
                arr[selfNum] = true;
            }
        }

        for (int i=1; i<arr.length; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }

    public static int getSelfNum(int n) {
        int sum = n;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}