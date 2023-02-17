import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("You enter number: ");
        int x = input.nextInt();
        int y = (x*x)+(2*x)+10;
        System.out.print("Your result: "+y);
    }
}
