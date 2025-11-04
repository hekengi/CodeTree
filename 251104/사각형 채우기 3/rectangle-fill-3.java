import java.util.Scanner;
public class Main {

    public static int MAX_NUM = 1000;
    public static int MOD = 1000000007;
    public static int[] arr = new int[MAX_NUM+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 7;

        for(int i = 3; i <= MAX_NUM; i++){
            arr[i] = (arr[i-1]*2 + arr[i-2]*3)%MOD;
            for(int j = i-3; j >= 0; j--){
                arr[i] = (arr[i] + arr[j]*2)%MOD;
            }
        }
        
        System.out.println(arr[n]);
    }
}