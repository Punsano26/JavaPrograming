import java.util.Scanner;

public class Exercise8 {
    public static void main (String[] args)  {
        Scanner point = new Scanner (System.in);
        System.out.print(" ENTER name Item : ");
        String name = point.nextLine();

        System.out.print(" ENTER Price Item : ");
        Float price = point.nextFloat();

        System.out.print(" ENTER quantity Item : ");
        int amount = point.nextInt();

        double quantity = (price*amount);

        System.out.println("Product name: "+ name+ " Product price: "+ price+ " quantity: "+ amount);
        double total = (quantity*5/100);
        double ftotal = (quantity-total);

System.out.println("Have you pay now:   "+ ftotal+ " Bath");

    }
}