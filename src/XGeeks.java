//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String superpower = JOptionPane.showInputDialog("What's Your SuperPower");
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("What's Your name?");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
String ask = JOptionPane.showInputDialog("Who do you want to learn about");
JOptionPane.showMessageDialog(null, name + "'s superower is " + superpower + "!");
String superpowera = JOptionPane.showInputDialog("What's Your SuperPower");
String superpowerb = JOptionPane.showInputDialog("What's Your SuperPower");
String superpowerc = JOptionPane.showInputDialog("What's Your SuperPower");
String namea = JOptionPane.showInputDialog("What's Your name?");
String nameb = JOptionPane.showInputDialog("What's Your name?");
String namec = JOptionPane.showInputDialog("What's Your name?");
	}
}

