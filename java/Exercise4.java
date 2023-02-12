import java.util.Scanner;
public class Exercise4{
     public static void main(String[] args){
           
            int a;
            int b;
            Scanner point = new Scanner(System.in);
            System.out.println("Enter a");
            a = point.nextInt();
            System.out.println("Enter b");
            b = point.nextInt();
            System.out.println("Before Swapping: ");
            System.out.println("a: " +a );
            System.out.println("b: "+b );

            int temp;
            temp = a;
            a=b;
            b=temp;
            System.out.println("After Swapping: ");
            System.out.println("a: " + a );
            System.out.println("b: "+ b );

    }
} 