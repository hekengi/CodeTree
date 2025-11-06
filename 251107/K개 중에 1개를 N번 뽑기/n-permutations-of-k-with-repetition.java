import java.util.*;

public class Main {
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static int N;
    public static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        // Please write your code here.

        choose(1);

    }

    public static void choose(int currNum){ // currNum = 1, 2, 3
        if(currNum == N+1){ // 3이면 호출 됨
            printAnswer(); // -, 
            return;
        }

        
        for(int select = 1; select <=K ; select++){ // select = 1, 1, 2
            answer.add(select); //[1, 2]
            choose(currNum + 1); // 
            answer.remove(answer.size() -1); // [1, ]

        }
    }

    public static void printAnswer(){
        for(int i = 0; i<N; i++){
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }
}