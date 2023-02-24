import java.util.Scanner;
public class Ex1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = input.nextInt();
        System.out.println("Enter number2");
        int b = input.nextInt();
        System.out.println("Enter number3");
        int c = input.nextInt();
        System.out.println("Enter number4");
        int d = input.nextInt();
        System.out.println("Enter number5");
        int e = input.nextInt();
        int mx = a;
        if(mx < b){
            mx =b;
        }
        if(mx < c){
            mx = c;
        }
        if (mx < d) {
            mx = d;
        }
       if (mx < e) {
            mx = e;
        }
        
            System.out.println("The maximum value is "+mx);
        
    }
}