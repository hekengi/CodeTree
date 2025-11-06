import java.util.*;
public class Main {
    public static int N;
    public static int count = 0;
    public static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        // Please write your code here.
        choose(0);
        System.out.println(count);
    }

    public static void choose(int currIndex){
        if(currIndex == N ){ // 종료 기준
            count ++;
            return;
        }

        for(int i = 1; i <= 4 ; i ++){
            if(i <= (N-currIndex)){
                for(int j= 1 ; j <= i ; j++){
                    arr.add(i);
                }
                choose(currIndex + i);
            }
        }
        return;


    }
}