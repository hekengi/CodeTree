import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();

        System.out.println( A >= B ? 1 :0 );
        System.out.println( A > B ? 1 :0 );
        System.out.println( A <= B ? 1 :0 );
        System.out.println( A < B ? 1 :0 );
        System.out.println( A == B ? 1 :0 );
        System.out.println( A != B ? 1 :0 );
    }
}