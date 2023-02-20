import java.util.Scanner;
public class Ex2 {
    public static void main (String[] ages) {
        Scanner input = new Scanner(System.in);
        System.out.println("Amount ITEMS : ");
        int n = input.nextInt();
        System.out.println("ITEMS Price : ");
        float x = input.nextFloat();
        float result = n*x;
        System.out.println("Total Price :"+result);

    }
    
}
