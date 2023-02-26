import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount of water used : ");
        float water = input.nextFloat();
        System.out.println("Domestic or Commercial");
        
        System.out.print("Type User : ");
        String user = input.next();
        float basic = 100;
        double totalpay = 0;
        String user1 = "Domestic";
        String user2 = "Commercial";
        if(user.equals(user1)){
            totalpay = basic + (water*0.5);
        }else{
            totalpay = basic +(water*0.9);
        }
        System.out.println(" ---------------------------------------------- ");
        System.out.println("You use water to "+water+" Liter");
        System.out.println("Your total pay water :"+totalpay+" Bath");
    }
}
