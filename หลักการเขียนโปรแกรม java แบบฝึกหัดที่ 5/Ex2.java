
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be divided = ");
        int n = input.nextInt();
        for(int i =1; i<=100; i++){
            if(i % n == 0){
                System.out.println(i+" mod"+n +" divisibly");
            }
        //    System.out.print("END");
        }
        System.out.print("END");
    }
}
