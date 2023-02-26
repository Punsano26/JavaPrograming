import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        for(int i = 101; i <1000;i++){
            if((i%5==0 || i%11==0) && i%55 !=0 ){
                if(i==105){
                System.out.print(i);}
                else{
                    System.out.print(", "+i);
                }
            }
        }
    }
}
