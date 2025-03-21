import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] clinic = new int[4];

        for (int i = 0; i<3 ; i++){
            char symp = sc.next().charAt(0);
            int temp = sc.nextInt();
            if(temp >= 37 ){
                if(symp == 'Y'){
                    clinic[0]++;
                }else {   
                    clinic[1]++;
                }
            }else if(symp == 'Y'&& temp < 37){
                clinic[2]++;
            }else
                clinic[3]++;
        }
        for(int i = 0 ; i <4; i++){
            System.out.print(clinic[i]+ " ");
        }
        if(clinic[0] >= 2) 
            System.out.print("E");

    }
}