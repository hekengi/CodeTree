import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        
        System.out.print(A/B + ".");
        for (int i=0; i<20; i++){
            A = A%B;
            A *= 10;
            System.out.print(A/B);
        }
    }
}