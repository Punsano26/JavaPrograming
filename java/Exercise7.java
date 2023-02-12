import java.util.Scanner;
public class Exercise7 
{
    public static void main (String[] args)
    {
    Scanner point = new Scanner (System.in);
        System.out.println("Enter name item");
        String name = point.nextLine();

        System.out.println("Enter price item");
        Float price = point.nextFloat();

        Float vat = (price*7/100);
        Float vatf = (price-vat); 
        System.out.print(" Name item: "+name);
        System.out.print("  Price item: "+price + " Bath ");
        System.out.print("  net price item: "+vatf + " Bath ");
        
    }
}