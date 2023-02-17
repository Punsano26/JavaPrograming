import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("amout items");
        int n = input.nextInt();
        
        float sum =0;
        do{
            System.out.print("Enter product price ");
            float x = input.nextFloat();
             sum = sum + x;
            n = n-1;
        }while(n > 0);
        System.out.println("Item Price "+sum);
    }

}
