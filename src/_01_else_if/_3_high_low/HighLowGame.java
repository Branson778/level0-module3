
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		System.out.println(random);

		// 2. Print out the random variable above
		for (int i = 0; i < 10; i++) {
		
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String answer= JOptionPane.showInputDialog("Guess the random number!");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int answerI= Integer.parseInt(answer);
			if(answerI == random) {
				JOptionPane.showMessageDialog(null, "You are correct! \n You Win!!!");
				System.exit(0);
			}
			else if(answerI>=random) {
				JOptionPane.showMessageDialog(null, "Oh sorry, but that's is too high.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Oh sorry, but that's too low.");
			}
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
		}
JOptionPane.showMessageDialog(null, "Sorry but, your out of tries. \n You lose.");
		// 13. Tell them they lose
		
	}

}


