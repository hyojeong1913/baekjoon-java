import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Stack st = new Stack();

        for (int i=0; i<num; i++) {
            String input = sc.next();

            if (check(input,st) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            st.clear();
        }

        sc.close();
    }

    static boolean check(String str, Stack st) {

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else {
                if (!st.empty()) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.empty();
    }
}