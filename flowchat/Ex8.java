import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int x = a.nextInt();
        if(x>0){
            System.out.println(x+" Is Positive Number.");
        }
        else if(x<0) {
            System.out.println(x+" Is Negative Number.");
        }else{
            System.out.println(x+" Is Zero.");
        }
    }
}
