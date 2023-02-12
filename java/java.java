import javax.swing.JOptionPane;
public class java {
    public static void main (String[] args) {
        int data = Integer.parseInt(JOptionPane.showInputDialog(null, "Input first number :"));
        int datatwo = Integer.parseInt(JOptionPane.showInputDialog(null, "Input second number :"));
        JOptionPane.showcomfirmDialog(null,"#data", "+", "#datatwo", (data+datatwo));
    }

}