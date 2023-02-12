import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first numer ");
        int x = input.nextInt(); 
        System.out.println("Enter your secound numer ");
        int y = input.nextInt(); 
        System.out.println("Enter your third numer ");
        int z = input.nextInt(); 
        
int max = 0;

        if (x > y) {
            if (x>z) {
                 max = x;
            }
            else {
                 max = z;
            }

        }
        else{
            if (y>z){
                 max = y;
            }
            else {
                 max = z;
            }
        }
        System.out.println("Maximum number is "+ max);
    }
}
