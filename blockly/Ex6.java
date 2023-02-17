import java.util.Scanner;
public class Ex6 {
    public static void main (String[] args)
    {
                Scanner a = new Scanner (System.in);
                double setanswer =1l;
                System.out.println("Since result 1 to 100 IS: ");
                for (double i = 1; i <= 100;i++){
                    if (i % 2 ==0) 
                    {
                        setanswer =  setanswer*i;
                        
                    }
                }System.out.println(setanswer);
    }
}
