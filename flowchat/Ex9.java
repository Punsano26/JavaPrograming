import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner ex9 = new Scanner(System.in);
        System.out.print("Mid team score: ");
        int a = ex9.nextInt();
        System.out.print("final team score: ");
        int b = ex9.nextInt();
        float sum = a+b;
        if(sum>=80){
            System.out.print(" A");
        }
        else if(sum>=75){
            System.out.print(" B+");
        }
        else if(sum>=70)
        {System.out.print(" B");}
        else if(sum>=65)
        {System.out.print(" C+");}
        else if(sum>=60)
        {System.out.print(" C");}
        else if(sum>=55)
        {System.out.print(" D+");}
        else if(sum>=50)
        {System.out.print(" D");}
        else 
        {System.out.print(" E");}
        

    }
    
}
