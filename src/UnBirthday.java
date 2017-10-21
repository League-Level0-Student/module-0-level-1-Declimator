import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String birthday = JOptionPane.showInputDialog("What's your Birthday?");
	if(birthday.equalsIgnoreCase("10/20")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday");
	
	}
	}
}

