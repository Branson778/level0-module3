
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob=new Robot();
		for (int i = 0; i < 99999999; i++) {
		String color= JOptionPane.showInputDialog("What Color would you like the shape to be?");
	    if (color.equalsIgnoreCase("Red")) {
			rob.setPenColor(Color.RED);
		} else {
rob.setRandomPenColor();
		}
		
	    
		//2. Make the robot draw a shape (this will take more than one line of code)
		rob.setSpeed(50);
		rob.setPenWidth(10);
		rob.penDown();
		for (int j = 0; j < 4; j++) {
			rob.move(200);
			rob.turn(90);
		}
		}
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
		
		//6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
