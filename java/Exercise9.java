import java.util.Scanner;
public class Exercise9 {
    public static void main (String[]args)
    {
        Scanner point = new Scanner (System.in);
        System.out.println(" push your money .... Bath : ");
        Float bath = point.nextFloat();

        double chang = (bath/35.50);
            System.out.println("Value: "+bath);
            System.out.println(" Bath To Chang dolar: "+chang);

            System.out.printf(" %.2f",chang);
            System.out.print(" Dolar");
    }
} 