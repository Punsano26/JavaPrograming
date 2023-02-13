import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int answer =0;
        for (int i = 1;i <= 100; i++){
           if (i %3 ==0){
            answer= i;
            System.out.println(answer);   
            }
        }
       
    }
}
