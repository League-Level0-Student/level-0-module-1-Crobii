package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		String riddle = JOptionPane.showInputDialog(null,
				"What is greater than God,\r\n" + "more evil than the devil,\r\n" + "the poor have it,\r\n"
						+ "the rich need it,\r\n" + "and if you eat it, you'll die?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (riddle.equals("nothing")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "correct!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else
			JOptionPane.showMessageDialog(null, "WRONG!");
		// 6. Add some more riddles
		riddle = JOptionPane.showInputDialog(null,
				"What has many keys but can't open a single lock?\r\n" + "\r\n" + "");

		if (riddle.equals("piano")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		} else
			JOptionPane.showMessageDialog(null, "WRONG!");

		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, score);
	}
}
