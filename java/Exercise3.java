import java.util.Scanner;
    public class Exercise3{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number ");
            int a = input.nextInt();


    System.out.println("Enter secound number ");
            int b = input.nextInt();

            System.out.println("Enter third number ");
            int c = input.nextInt();

            System.out.println("Enter fourth number ");
            int d = input.nextInt();

            System.out.println("Enter fifth number ");
            int e = input.nextInt();
            input.close();
        double Average =(a+b+c+d+e)/5;
            System.out.println("Average of :" + a+" "+b+" "+c+" "+d+" "+e+" "+ "IS : "+Average);
            
        }
    }