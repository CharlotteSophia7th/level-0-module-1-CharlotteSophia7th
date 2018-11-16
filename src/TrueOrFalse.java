import javax.swing.JOptionPane;

public class TrueOrFalse {
public static void main(String[] args) {
	String gender= JOptionPane.showInputDialog("Are you a girl or a boy?");
	if (gender.equals("girl")) {
		for (int i = 0; i < 7; i++) {
			System.out.println("You are a girl.");
		}
		
	}
	else if(gender.equals("boy")) {
		for (int i = 0; i < 7; i++) {
			System.out.println("You are a boy.");
		}
	}
	else {
		JOptionPane.showMessageDialog(null, "You are not a girl or a boy!!");
	}
}
}
