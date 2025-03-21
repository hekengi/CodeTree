import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 원소 개수
        int Q_num = sc.nextInt(); // 질문 개수
        int[] arr = new int[num];
        int b_count = 0;

        for(int i = 0 ; i < num ; i++ ){ // 배열에 숫자 넣기
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < Q_num ; i++ ){ // 질문 개수 만큼 읽기
            int question = sc.nextInt(); // 몇번째 질문인지 (1,2,3)
            if (question == 1){
                System.out.println(arr[sc.nextInt() -1]);
            }else if (question == 2){
                int b_first = sc.nextInt();
                for ( int j = 0; j < num ; j ++) {
                    if (arr[j] == b_first){
                        b_count = j+1;
                        break;
                    }else 
                        b_count = 0;
                }
                System.out.println(b_count);
            }else{
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int j = s-1; j<e ; j ++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
            
            
        }
    }
}