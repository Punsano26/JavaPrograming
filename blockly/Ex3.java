import java.util.Scanner;

import org.w3c.dom.events.Event;
public class Ex3 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        int number;
        do{
            System.out.println("Enter your number ");
            number = input.nextInt();
        }while(number%2==0);
        System.out.print("yeah! You Enter odd number. "+number);


        
    }
}
