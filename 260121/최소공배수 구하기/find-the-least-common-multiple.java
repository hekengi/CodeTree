import java.util.*;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int lower = Math.min(n, m);
        int gcd = 1;
        for(int i = lower; i > 0 ;  i--){
            if(n%i==0 && m%i == 0){
                gcd = i;
                break;
            }
        }
        int n_a = n/gcd;
        int m_a = m/gcd;
        System.out.println(gcd*n_a*m_a);
    }
}