
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	static Robot r2d2 = new Robot();
	public static void main(String[] args) throws Exception {
		
		// 1. Make a new Robot
		

		// 3. Put the robot's pen down
		r2d2.penDown();

		// 6. Make the robot move as fast as possible
		r2d2.setSpeed(100);
		r2d2.miniaturize();
		r2d2.move(100);
		r2d2.move(-50);
		r2d2.turn(45);
		r2d2.move(65);
		r2d2.move(-65);
		r2d2.turn(90);
		r2d2.move(65);
		r2d2.turn(-45);
		r2d2.penUp();
		r2d2.move(25);
		r2d2.turn(-70);
		r2d2.penDown();
		r2d2.move(60);
		r2d2.turn(140);
		r2d2.move(60);
		r2d2.move(-30);
		r2d2.turn(110);
		r2d2.move(20);
		r2d2.turn(180);
		r2d2.penUp();
		r2d2.move(50);
		r2d2.turn(-90);
		r2d2.move(40);
		r2d2.penDown();
		r2d2.move(10);
		r2d2.turn(90);
		r2d2.move(10);
		r2d2.turn(90);
		r2d2.move(10);
		r2d2.turn(90);
		r2d2.move(10);
		r2d2.move(-5);
		r2d2.turn(-90);
		r2d2.penUp();
		r2d2.move(20);
		r2d2.penDown();
		r2d2.move(50);
		// 5. Do everything below here 4 times
			}
	void makeSquare() {
		for (int i = 0; i < 4; i++) {

			// 2. Move your robot 200 pixels
			r2d2.move(200);

			// 4. Turn the robot 90 degrees to the right (90 degrees)
			r2d2.turn(90);

		}

	}
}
