import java.util.Scanner;

public class Exercise5{
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("ENter your weight (KG) ");
        double weight = scan.nextDouble();
        System.out.println("ENter your Height (CM) ");
        double height = scan.nextDouble();
        double h = (height/100);
        double bmi = weight /(h*h);
        System.out.println("Your bmi is : " + bmi);
        String status = " ";
        if (bmi >= 30)
        status = "Very fat";
        else if (bmi>=25)
        status = "Fat";
        else if (bmi>=23)
        status = "Overweight";
        else if (bmi >=18)
        status = "normal";

        else
            status = "Underweight.";
            System.out.println("You are :" +status);
    }
}