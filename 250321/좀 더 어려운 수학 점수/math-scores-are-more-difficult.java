import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        double a_math = sc.nextDouble(), a_english = sc.nextDouble();
        double b_math = sc.nextDouble(), b_english = sc.nextDouble();

        if (a_math > b_math || a_math == b_math && a_english > b_english)
            System.out.println('A');
        else
            System.out.println('B');
    }
}