import java.util.Scanner;

public class Exercise1 {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter first number : ");
    int a = input.nextInt();

    System.out.print("Enter Secound nuber : ");
    int b = input.nextInt();
    input.close();

    System.out.println(a+" + "+b+" = "+(a+b));
    System.out.println(a+" - "+b+" = "+(a-b));
    System.out.println(a+" * "+b+" = "+(a*b));
    System.out.println(a+" / "+b+" = "+(a/b));
    System.out.println(a+" % "+b+" = "+(a%b));
}    
}