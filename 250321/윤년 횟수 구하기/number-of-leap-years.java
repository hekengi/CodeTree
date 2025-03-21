import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for( int i = N; 0 < i ; i--){
            if (i % 4 == 0 ) {
                count ++;
            }
            if (i % 100==0 ){
                if(i % 400 != 0){
                    count --;
                }
            }
        }
        System.out.println(count);
    }
}