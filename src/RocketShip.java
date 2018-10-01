public class RocketShip
{
	/*
	* Scalable Rocket Ship ASCII Art Project:
	*
	* Part 1: Create a program that prints various size ASCII art rockets by calling the drawRocket method specifying
	* the rocket size as an integer parameter. Your main method should call the drawRocket method passing a class
	* constant as the rocket size parameter. The class constant is the only value that should change in order to
	* print different size rockets! The drawRocket method must be able to handle illegal sizes (e.g. 0, negative sizes)
	* in which case it should do nothing.
	*/
	public static void main(String[] args) {
	}

	public static void drawRocket(int size) {
	}
	
	/* Part 2: Modify your main method to call the rocketLaunch method. The rocketLaunch method takes three integer
	* parameters: minSize, maxSize and sizeStep that are defined as class constants. It will call the drawRocket
	* method to print several rockets from maxSize to minSize decreasing the rocket size by sizeStep on each rocket
	* so that the resulting output should look like the big rocket is chasing and eating the smaller rocket. The
	* following example demonstrates a call to rocketLaunch(1, 5, 2) with 1 as minSize, 5 as maxSize and 2 as sizeStep.
	* This will print the rockets sized 5, 3, and 1. The rocketLaunch method may assume the parameters are valid.
	* In other words, it doesn't need to check for parameter error. It is important to note that all the rockets
	* printed must be center justified. In order to do this, the drawrocket method must accept a second integer
	* parameter leftPadding that specifies the number of spaces inserted to the left of the rocket so that it will
	* be aligned with bigger rockets at the center column.
	*/
	public static void drawRocket(int size, int leftPadding) {
	}
	
	public static void rocketLaunch(int minSize, int maxSize, int sizeStep) {
	}
	
}   //class RocketShip

