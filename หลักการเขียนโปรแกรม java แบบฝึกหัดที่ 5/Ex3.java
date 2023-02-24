import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("redains: ");
        float r = input.nextFloat();
        System.out.print("hight: ");
        float h = input.nextFloat();
        double area = 3.14*r*r*h;
        System.out.println("Cylinder volume= "+area+"cubic centimeter");
    }
}

