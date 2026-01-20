import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int count = 0;

        for(int i = A; i <= B ; i++){
            String str = Integer.toString(i);
            if(i%3==0 || str.contains("3") || str.contains("6") ||str.contains("9")){
                count+=1;
            }
        
        }
        System.out.print(count);
    }
}