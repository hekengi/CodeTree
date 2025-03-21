import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        for(int i=3 ; 0<i ; i--){
            char symptom = sc.next().charAt(0);
            int temp = sc.nextInt();
            if(symptom == 'Y' && temp >= 37)
                count++;
        }
        if ( count >=2 ) System.out.println("E");
        else System.out.println("N");
        
    }
}