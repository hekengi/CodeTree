import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i = num ; i >0 ; i --){

            int[] arr = new int[4];
            for ( int j = 0 ; j < 4 ; j ++){
                arr[j] = sc.nextInt();
            }
            double avg = (double)(( arr[0] + arr[1] + arr[2] + arr[3] )/4);
            if(avg>=60){
                System.out.println("pass");
                count++;
            }else 
                System.out.println("fail");
        }
        System.out.println(count);
    }
}