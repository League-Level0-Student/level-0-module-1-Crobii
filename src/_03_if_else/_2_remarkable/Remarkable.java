package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String spongebob = "originally called Spongeboy";
		String creeper = "made from a coding bug";
		String eelektross = "has no weakness";

// 1. Save something remarkable about each person in a variable.

		String name = JOptionPane.showInputDialog(null, "please type in a name");

		if (name.equals("spongebob")) {
			JOptionPane.showMessageDialog(null, spongebob);
		} else if (name.equals("creeper")) {
			JOptionPane.showMessageDialog(null, creeper);
		} else if (name.equals("eelektross")) {
			JOptionPane.showMessageDialog(null, eelektross);

		} else {

			JOptionPane.showMessageDialog(null, "what??");
		}

// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person.

	}
}
