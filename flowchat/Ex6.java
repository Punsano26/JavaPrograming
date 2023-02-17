import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your first number :");
        int a = input.nextInt();
        System.out.println("Your secound number :");
        int b = input.nextInt();
        if(a>b){
            System.out.println("a มากกว่า b");
        }
        else{
            if(a<b){
                System.out.println("b มากกว่า A");
            }else{
                System.out.println("a = b");
            }
        }
    }
}
