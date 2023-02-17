import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
    String answer =" ";
        for (int i = 1;i <= 100; i++){
           if (i %3 ==0){
                if(answer==" "){
                    answer =answer+i;
                }
                else{
                    answer = answer + ", "+i ;
                }
              
            }
            
        }
        System.out.print(answer);
    }
}
