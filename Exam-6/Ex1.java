import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ex1 {
    // Method
    /**
     * Check number type and print out
     * 
     * @param num
     */
    // ข้อหนึ่ง
    public void printType1(int num) {
        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is positive");
        }
    }

    // ข้อสอง
    public void printType2(int number) {
        if (number == 0) {
            System.out.println(number + " Is zero");
        } else if (number % 2 != 0) {
            System.out.println(number + " Is odd");
        } else {
            System.out.println(number + " Is Even");
        }
    }

    // ข้อสาม

    public void checkVowel(char check) {
        if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u' ||
                check == 'A' || check == 'E' || check == 'I' || check == 'O' || check == 'U') {

            System.out.println(check + " This character is a vowel.");
        } else {
            System.out.println(check + " This character is not vowel.");
        }
    }

    // ข้อสี่

    public void checkChar(char check) {
        if (check >= 65 && check <= 90) {
            System.out.println(" This  charactor is Uppercase");
        } else if (check >= 97 && check <= 122) {
            System.out.println(" This charactor is Lowercase");
        } else {
            System.out.println(" This charactor is not a letter");
        }
    }

    // ข้อห้า
    public void isPositive(int num, Scanner input) {
        while (num <= 0) {
            System.out.println("Please, enter a positive number");
            num = input.nextInt();
        }
        System.out.println("Positive number");
    }

    // ข้อหก

    public void isOdd(int num, Scanner input) {
        do {
            System.out.print("Enter number here : ");
            num = input.nextInt();
        } while (num % 2 == 0);
        System.out.println(num + " is odd");

    }

    // ข้อเจ็ด

    public void isDividedByN(int n, Scanner input) {

        System.out.print("Enter number(N) : ");
        n = input.nextInt();
        System.out.print("Enter number(X) : ");
        int x = input.nextInt();
        String ans = "";
        for (int i = 1; i <= n; i++) {
            if (i % x == 0) {
                if (ans == "") {
                    ans = ans + i;
                } else {
                    ans = ans + "," + i;
                }
            }
        }
        System.out.println(ans);

    }

    //ข้อแปด

    public void printStarAdvance(int numline, Scanner input) {

        System.out.print("Enter number of Line: ");
        numline = input.nextInt();
       
        for (int i = 1; i <= numline; i++) {
            System.out.print("*");
           
            for (int j = 1; j <= i-1; j++) {
                System.out.print("_");
                
            }
            if(i>1) {
            System.out.print("*");
             }

             System.out.println();
        }
        input.close();
    }

    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        Scanner input = new Scanner(System.in);
        // System.out.println("Please, enter a number: ");
        // int num = input.nextInt();
        // ex.printType1(num);
        // ex.printType2(num);
        // ex.isPositive(num, input);
        // ex.isOdd(0, input);
        // ex.isDividedByN(0, input);
        ex.printStarAdvance(0, input);


        // System.out.println("Please, enter a charactor");
        // String text = input.next();
        // char check = text.charAt(0);
        // ex.checkVowel(check);
        // ex.checkChar(check);

    }

}