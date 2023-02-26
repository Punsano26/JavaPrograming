import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner ex10 = new Scanner(System.in);
            System.out.print("The width of the first quadrilateral : ");
            float w1 = ex10.nextFloat();
            System.out.print("The long of the first quadrilateral : ");
            float l1 = ex10.nextFloat();
            System.out.print("The width of the Secound quadrilateral : ");
            float w2 = ex10.nextFloat();
            System.out.print("The long of the Secound quadrilateral : ");
            float l2 = ex10.nextFloat();
            double ans1 = w1*l1;
            double ans2 = w2*l2;
            System.out.println("------------------------------------");
            if(ans1>ans2){
                System.out.println("first square area more than Secound square");
            }
            else if(ans1==ans2){
                System.out.println("first square area equal Secound square");
            }
            else{
                System.out.println("Secound square area more than First square");
            }
            System.out.println("------------------------------------");
            System.out.println("First square area = "+ans1);
            System.out.println("Secound square area = "+ans2);
    }
}
