import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        if ( A >= B ){
            if ( A >= C)
                System.out.println(A);
            else 
                System.out.println(C);
        }else if ( A <= B){
            if ( B >= C)
                System.out.println(B);
            else 
                System.out.println(C);
        }
    }
}