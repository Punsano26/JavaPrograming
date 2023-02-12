import javax.swing.JOptionPane;
public class Showinputdiarogdemo {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "youe name is " + data);
    }
}
