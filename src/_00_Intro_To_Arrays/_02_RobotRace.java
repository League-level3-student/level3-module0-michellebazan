package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		
		Robot[] ro = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for(int i = 0; i < 5; i++) {
			ro[i] = new Robot();
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			ro[i].setX(i * 60 + 30);
			ro[i].setY(600);
			ro[i].setSpeed(69);
		}
		Random rand = new Random();
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		int ha = 0;
		while(ha == 0) {
			
			// 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.
			for(int k = 0; k < 5; k++) {
				ro[k].move( rand.nextInt(50));
				if(ro[k].getY()<=0) {
					ha = 1;
					// 7. declare that robot the winner and throw it a party!
					System.out.println( "Robot #" + k + " is the winner!!!");
					ro[k].sparkle();
					k=5;
					for(int a=0; a < 5;a++) {
						ro[a].turn(360+90);
						ro[a].moveTo(0, a*60 + 20);
					}
				}
			}
			
			
		}
		
		
		int ae = 0;
		while(ae == 0) {
			for(int f = 0; f < 5; f++) {
				ro[f].move( rand.nextInt(50));
				if(ro[f].getX()>=900) {
					ae = 1;
					// 7. declare that robot the winner and throw it a party!
					System.out.println( "Robot #" + f + " is the winner!!!");
					ro[f].sparkle();
					f=5;
				}
		    }
		
	    }
		
		for(int i = 0; i < 5; i++) {
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			ro[i].moveTo(0 + i * 60, 600);
		}
		int circle = 0;
		int chicken = 0;
		while(circle ==0) {
			for(int q = 0; q < 5; q++) {
				ro[q].move( rand.nextInt(50));
				if(ro[q].getY()<=0) {
					// 7. declare that robot the winner and throw it a party!
					chicken++;
					ro[q].sparkle();
					
					for(int a=0; a < 5;a++) {
						ro[a].turn(360+90);
						ro[a].moveTo(ro[q].getX() + 60 * a, ro[q].getY());
					}
					q=5;
				}
			}
			for(int z = 0; z < 5; z++) {
				ro[z].move( rand.nextInt(50));
				if(ro[z].getX()>=900) {
					chicken++;
					
					for(int w=0; w < 5;w++) {
						ro[w].turn(360+90);
						ro[w].moveTo(ro[z].getX() , ro[z].getY());
					}
					
					if(chicken >=4) {
						circle = 1;
						System.out.println( "Robot #" + z + " is the winner!!!");
						ro[z].sparkle();
					}
					z=5;
				}
		    }
		}

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

}
	}
