import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	
	String score=JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
	if (score.equals("a stamp")) {
		JOptionPane.showMessageDialog(null, "Correct!");
	}
	
	else {
		JOptionPane.showMessageDialog(null, ("You're wrong! The correct answer is: a stamp"));	}
	String score2=JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?");
	if (score2.equals("a towel")) {
		JOptionPane.showMessageDialog(null, "Correct!");
	
	}
	else {
		JOptionPane.showMessageDialog(null, "You're wrong! The correct answer is a towel.");
	}
}
}
