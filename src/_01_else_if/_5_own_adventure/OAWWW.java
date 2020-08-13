package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OAWWW {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "A have a story to tell, and it is about a coin collecter.");
	String YN= JOptionPane.showInputDialog("Would you like to hear it?");
	if (YN.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Alright. It started when a young man found a strange coin on the ground. \n He thought it was good luck and started collecting unique coins. \n He collected any coin that wasn't money, with coins from games,places,and more. \n But one day he walked into a store and something caught his eye...");
	String YN2= JOptionPane.showInputDialog("So what do you think was it? \n Another coin for his collection, or something different?");
	if (YN2.equalsIgnoreCase("Another Coin")) {
		JOptionPane.showMessageDialog(null, "Indeed it was another coin. He picked it up, bought and went home to add it \n to his collection heartlessly. That first coin had taken over his mind, and \n nothing could stop it.");
	}
	else if (YN2.equalsIgnoreCase("Something Different")) {
		JOptionPane.showMessageDialog(null, "Indeed it was something new. It was a glimmer in the back room of the shop. A light in the wall. He walked over to it. \n Then everything Froze. Birds stopped and everything else did too. \n He walked closer until he opened the door. It looked like a portal. \n And some shadowy figue dropped the first coin he found. The portal closed, and the door shut and locked. \n He was trapped.");
	JOptionPane.showMessageDialog(null, "Shadows creeped upto him. He kicked the door open. The outside had turned to light. \n The shadows were pushing him into it. Something was floating in that void. \n It floated over to him,and he grabbed it. Everything became normal again. Quikly he bought the item and went to his house.  \n He opened his bed room door everthing was dark exept the strange coin. \n He took the object he had bought and hit the coin as hard as he could. \n He woke up later and found everthing normal. the thing was gone, his room was back. \n But the first coin was shattered and shadows came out of it. It dissapered never to be seen again. The End ... for now");
	}
	else {
		JOptionPane.showMessageDialog(null, "Your not listening are you. I'm not going to finish it anymore.");
	}
	}
	else {
		JOptionPane.showMessageDialog(null, "Fine then don't.");
	}
	
	
	
	
	
}
}
