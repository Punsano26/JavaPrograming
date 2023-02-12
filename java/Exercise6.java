import java.util.Scanner;
public class Exercise6{
    public static void main (String[] args) 
    {
        Scanner point = new Scanner (System.in);
        System.out.println("Enter first number_float :");
        double first  = point.nextDouble();
        System.out.println("Enter secound number_float :");
        double secound  = point.nextDouble();
        System.out.println("A? = "+first);
        System.out.println("B? = "+secound);
        double output = (first-secound)*(first+secound);
        System.out.println("("+first+"-"+secound+")"+"("+first+"+"+secound+") = "+ output);
        

    }

}