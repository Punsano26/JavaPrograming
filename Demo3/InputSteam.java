import java.io.*;
public class InputSteam {
 public static void main(String[] args) {
   
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader stdin = new BufferedReader(reader);
            System.out.println("Enter your text :");
            String input = stdin.readLine();
            System.out.println ("your text is \""+ input + "\"");
        }catch (IOException e) {

            e.printStackTrace();
        }
}
}
