import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println(A%3 == 0 || A%5 == 0 ? 1 : 0);
    }
}