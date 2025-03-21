import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for ( int i = 1 ; i <= N ; i++ ){
            String tmp = Integer.toString(i);
            if(i%3 == 0 || tmp.contains("3")|| tmp.contains("6")|| tmp.contains("9"))
                System.out.print("0 ");
            else
                System.out.print(i + " ");
        }

    }
}