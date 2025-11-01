import java.util.*;
public class Main {
    public static final int MAX_NUM = 45;
    public static final int UNUSED = -1;

    public static int n;
    public static int[] memo = new int[MAX_NUM +1];

    public static void init (){
        for (int i = 0; i <= MAX_NUM ; i++){
            memo[i] = UNUSED;
        }
    }

    public static int fib(int n){
        if (memo[n] != UNUSED){
            return memo[n];
        }
        if (n==1 || n==2){
            return memo[n] = 1;
        }

        return memo[n] = fib(n-1) + fib(n-2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        init();
        System.out.println(fib(n));

    }
    
    
}