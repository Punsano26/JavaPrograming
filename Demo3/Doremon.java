
import javax.swing.JOptionPane;
public class Doremon {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog(null, "Hi! What is your name?", "Doremon",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello,My name is:  " + data , "Me",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Oh! hi , :  " + data, "Doremon",JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showMessageDialog(null, "What can do you for you?  ", "Doremon",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "I want to go to the future.", "Xinan", JOptionPane.INFORMATION_MESSAGE);

        // STRING intt = JOptionPane.showInputDialog(null, "Of course, What is the present year? ");
        int intt = Integer.parseInt(JOptionPane.showInputDialog(null, "Of course, What is the present year? ", "Doremon",JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showConfirmDialog(null, "It is : "+ intt, "Xinan",JOptionPane.INFORMATION_MESSAGE);
        

        int nextyear = Integer.parseInt(JOptionPane.showInputDialog(null,"Ok. How many years do you want to travel?", "Doremon",JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, "I want to go for : "+ nextyear, "Xinan",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Ok. Lets Gooooooooooo!", "Doremon",JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, ".............................", "tamacine",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ".............................", "tamacine",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ".............................", "tamacine",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, ".............................", "tamacine",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Hello Welcome to "+ (intt+nextyear) , "Doremon",JOptionPane.INFORMATION_MESSAGE );

}
}
