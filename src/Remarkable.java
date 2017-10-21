import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name");
		if(name.equalsIgnoreCase("Pranav")) {
			JOptionPane.showMessageDialog(null, "Pranav is remarkable");
		}
		else if(name.equalsIgnoreCase("Ryan")) {
			JOptionPane.showMessageDialog(null, "Ryan is amazing");
		}
	
		else if(name.equalsIgnoreCase("Phillip")) {
			JOptionPane.showMessageDialog(null, "Phillip is awesome");
		}
	
		else if(name.equalsIgnoreCase("Max")) {
			JOptionPane.showMessageDialog(null, "Max is incredible");
		}

	
		
	}
	}






