import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int fstNum = n/10;
        int sndNum = n - fstNum*10;
        if(n%2 == 0 && (fstNum + sndNum)%5 ==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}