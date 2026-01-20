import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        // Please write your code here.
        for(int i = 0; i < rowNum; i ++){
            rec(colNum);
            System.out.println();
        }
    }
    public static void rec(int colNum){
        for(int i = 0; i < colNum; i ++){
            System.out.print("1");
        }
        
    }
}