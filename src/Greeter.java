import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String pizza = JOptionPane.showInputDialog(null,"What is your name");
	JOptionPane.showMessageDialog(null, "Hi "+ pizza);

}
}
