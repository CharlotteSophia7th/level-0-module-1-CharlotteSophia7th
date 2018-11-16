import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String password= "hi";
		String answer=JOptionPane.showInputDialog("Write a secret message.");
		JOptionPane.showInputDialog("You can only see the secret message if you can guess the passcode.");
		if(answer.equals("hi")) {
			JOptionPane.showMessageDialog(null, answer);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Intruder!");
		}
	}

}
