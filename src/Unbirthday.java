import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("What is your birthday? ex. mm/dd");
if(birthday.equals("11/08")) {
		System.out.println("Happy Birthday!");
	} else {
		System.out.println("Have a very merry unbirthday!");
	}
}
}
