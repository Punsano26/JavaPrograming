import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int number;
        do{
            System.out.println("push your numbers: ");
            number = input.nextInt();
        }while(number <= 0);
        System.out.println("you Number is  "+number);
    }
}