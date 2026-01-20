import java.util.*;

public class Main {
    public static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        for(int i = a ; i <= b ; i++){
            findPrime(i);
        }
        System.out.print(sum);
    }
    public static void findPrime(int num){
        int count = 0;
        for(int i = 2; i<num ; i++){
            if(num%i == 0) count++;
        }
        if(count == 0){
            sum += num;
        }
    }
}