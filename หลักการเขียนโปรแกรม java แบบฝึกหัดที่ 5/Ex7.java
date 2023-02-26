import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner ex7 = new Scanner(System.in);
        System.out.print("Your work hour  : ");
        int hour = ex7.nextInt();
        System.out.print("Your work overtime hours  : ");
        int overtime = ex7.nextInt();
        System.out.print("Your wages per hour  : ");
        int wages = ex7.nextInt();
        int a = hour*wages;
        double b = overtime*(wages*1.5);
        System.out.println("normal wages = "+a);
        System.out.println("overtime pay = "+b);
        System.out.println(" ___________________ ");
        System.out.println("Total wages = "+(a+b));
    }
    
}
