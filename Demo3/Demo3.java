import javax.swing.JOptionPane;
public class Demo3 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, World", "MyDialog",
                JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello, World", "MyDialog",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello, World", "MyDialog",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello, World", "MyDialog",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello, World", "MyDialog",
                JOptionPane.WARNING_MESSAGE);
    }
}
