import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner ex9 = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name = ex9.nextLine();
        System.out.print("Your birth (Buddhist era) : ");
        int birth = 0;
        do{ birth = ex9.nextInt();
            
            if(birth>2566){
                System.out.print("Error Please try again = ");
            }
            else{
                int age = 2566-birth;
                System.out.println( "---------------------");
                System.out.println("Your ages : "+age);
                System.out.println("Your name : "+name);
            }
        }
        while(birth>2566);


    }
}
