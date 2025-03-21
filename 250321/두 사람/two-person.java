import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A_age = sc.nextInt();
        char A_sex = sc.nextLine().charAt(1);

        int B_age = sc.nextInt();
        char B_sex = sc.nextLine().charAt(1);

        if ( (A_age >= 19 && A_sex == 'M') || (B_age >= 19 && B_sex == 'M') )
            System.out.println(1);
        else
            System.out.println(0);


    }
}