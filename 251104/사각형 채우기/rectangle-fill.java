import java.util.Scanner;
public class Main {
    public static int MAX_NUM = 1000;
    public static int MOD = 10007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[MAX_NUM+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i <= MAX_NUM ; i++){
            arr[i] = (arr[i-2] + arr[i-1]) % MOD;
        }

        System.out.println(arr[n]);
    }
}