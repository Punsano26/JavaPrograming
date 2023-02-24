import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("time call now : ");
        int call = input.nextInt();
        int totalpay;
        if(call <3){
            totalpay = call*5;
        }
        else{
            totalpay = 10 + (call-2)*2;
        }
        System.out.println("Totalpay : "+totalpay);
    }
}
