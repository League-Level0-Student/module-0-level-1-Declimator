import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("Who makes it, has no need of it.Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equalsIgnoreCase("coffin")) {
JOptionPane.showMessageDialog(null, "correct");
score ++;

	


}
		// 5. Otherwise, say "wrong" and tell them the answer

	
else {
JOptionPane.showMessageDialog(null, "incorrect");
}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
if (answer2.equalsIgnoreCase("a coin")) {
JOptionPane.showMessageDialog(null, "correct");
score ++;

	


}
else {
JOptionPane.showMessageDialog(null, "incorrect");
}
String answer3 = JOptionPane.showInputDialog("If you look at the number on my face you won't find thirteen anyplace.");
if (answer3.equalsIgnoreCase("a clock")) {
JOptionPane.showMessageDialog(null, "correct");
score ++;

	


}
else {
JOptionPane.showMessageDialog(null, "incorrect");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "congradulations, your score is " + score + "!");
	
	
}
}