import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        max(n, m);
    }
    public static void max(int n, int m){
        int result = 0;
        int num = 0;
        while(true){
            num += 1;
            if(n%num == 0 && m%num == 0){
                result = num;
            }
            if(num > n || num > m) break;
        }
        System.out.print(result);
    }
}