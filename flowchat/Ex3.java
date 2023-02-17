import java.util.Scanner;
public class Ex3 {
    public static void main (String[] agrs){
        Scanner input = new Scanner (System.in);
        System.out.println("redains: ");
        float r = input.nextFloat();
        double area = r *r * 3.14;
        System.out.println("Circle area= "+area);
    }
    
}
